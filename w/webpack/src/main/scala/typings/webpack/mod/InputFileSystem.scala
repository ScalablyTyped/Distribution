package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputFileSystem extends StObject {
  
  var dirname: js.UndefOr[js.Function1[/* arg0 */ String, String]] = js.undefined
  
  var join: js.UndefOr[js.Function2[/* arg0 */ String, /* arg1 */ String, String]] = js.undefined
  
  var lstat: js.UndefOr[
    js.Function2[
      /* arg0 */ String, 
      /* arg1 */ js.Function2[
        /* arg0 */ js.UndefOr[
          Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
        ], 
        /* arg1 */ js.UndefOr[IStats], 
        Unit
      ], 
      Unit
    ]
  ] = js.undefined
  
  var purge: js.UndefOr[js.Function1[/* arg0 */ js.UndefOr[String], Unit]] = js.undefined
  
  def readFile(
    arg0: String,
    arg1: js.Function2[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      /* arg1 */ js.UndefOr[String | Buffer], 
      Unit
    ]
  ): Unit
  
  var readJson: js.UndefOr[
    js.Function2[
      /* arg0 */ String, 
      /* arg1 */ js.Function2[
        /* arg0 */ js.UndefOr[
          Null | js.Error | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
        ], 
        /* arg1 */ js.UndefOr[Any], 
        Unit
      ], 
      Unit
    ]
  ] = js.undefined
  
  def readdir(
    arg0: String,
    arg1: js.Function2[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      /* arg1 */ js.UndefOr[js.Array[Buffer | IDirent | String]], 
      Unit
    ]
  ): Unit
  
  def readlink(
    arg0: String,
    arg1: js.Function2[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      /* arg1 */ js.UndefOr[String | Buffer], 
      Unit
    ]
  ): Unit
  
  var realpath: js.UndefOr[
    js.Function2[
      /* arg0 */ String, 
      /* arg1 */ js.Function2[
        /* arg0 */ js.UndefOr[
          Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
        ], 
        /* arg1 */ js.UndefOr[String | Buffer], 
        Unit
      ], 
      Unit
    ]
  ] = js.undefined
  
  var relative: js.UndefOr[js.Function2[/* arg0 */ String, /* arg1 */ String, String]] = js.undefined
  
  def stat(
    arg0: String,
    arg1: js.Function2[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      /* arg1 */ js.UndefOr[IStats], 
      Unit
    ]
  ): Unit
}
object InputFileSystem {
  
  inline def apply(
    readFile: (String, js.Function2[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      /* arg1 */ js.UndefOr[String | Buffer], 
      Unit
    ]) => Unit,
    readdir: (String, js.Function2[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      /* arg1 */ js.UndefOr[js.Array[Buffer | IDirent | String]], 
      Unit
    ]) => Unit,
    readlink: (String, js.Function2[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      /* arg1 */ js.UndefOr[String | Buffer], 
      Unit
    ]) => Unit,
    stat: (String, js.Function2[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      /* arg1 */ js.UndefOr[IStats], 
      Unit
    ]) => Unit
  ): InputFileSystem = {
    val __obj = js.Dynamic.literal(readFile = js.Any.fromFunction2(readFile), readdir = js.Any.fromFunction2(readdir), readlink = js.Any.fromFunction2(readlink), stat = js.Any.fromFunction2(stat))
    __obj.asInstanceOf[InputFileSystem]
  }
  
  extension [Self <: InputFileSystem](x: Self) {
    
    inline def setDirname(value: /* arg0 */ String => String): Self = StObject.set(x, "dirname", js.Any.fromFunction1(value))
    
    inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
    
    inline def setJoin(value: (/* arg0 */ String, /* arg1 */ String) => String): Self = StObject.set(x, "join", js.Any.fromFunction2(value))
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setLstat(
      value: (/* arg0 */ String, /* arg1 */ js.Function2[
          /* arg0 */ js.UndefOr[
            Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
          ], 
          /* arg1 */ js.UndefOr[IStats], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "lstat", js.Any.fromFunction2(value))
    
    inline def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
    
    inline def setPurge(value: /* arg0 */ js.UndefOr[String] => Unit): Self = StObject.set(x, "purge", js.Any.fromFunction1(value))
    
    inline def setPurgeUndefined: Self = StObject.set(x, "purge", js.undefined)
    
    inline def setReadFile(
      value: (String, js.Function2[
          /* arg0 */ js.UndefOr[
            Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
          ], 
          /* arg1 */ js.UndefOr[String | Buffer], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "readFile", js.Any.fromFunction2(value))
    
    inline def setReadJson(
      value: (/* arg0 */ String, /* arg1 */ js.Function2[
          /* arg0 */ js.UndefOr[
            Null | js.Error | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
          ], 
          /* arg1 */ js.UndefOr[Any], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "readJson", js.Any.fromFunction2(value))
    
    inline def setReadJsonUndefined: Self = StObject.set(x, "readJson", js.undefined)
    
    inline def setReaddir(
      value: (String, js.Function2[
          /* arg0 */ js.UndefOr[
            Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
          ], 
          /* arg1 */ js.UndefOr[js.Array[Buffer | IDirent | String]], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "readdir", js.Any.fromFunction2(value))
    
    inline def setReadlink(
      value: (String, js.Function2[
          /* arg0 */ js.UndefOr[
            Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
          ], 
          /* arg1 */ js.UndefOr[String | Buffer], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "readlink", js.Any.fromFunction2(value))
    
    inline def setRealpath(
      value: (/* arg0 */ String, /* arg1 */ js.Function2[
          /* arg0 */ js.UndefOr[
            Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
          ], 
          /* arg1 */ js.UndefOr[String | Buffer], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "realpath", js.Any.fromFunction2(value))
    
    inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
    
    inline def setRelative(value: (/* arg0 */ String, /* arg1 */ String) => String): Self = StObject.set(x, "relative", js.Any.fromFunction2(value))
    
    inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    
    inline def setStat(
      value: (String, js.Function2[
          /* arg0 */ js.UndefOr[
            Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
          ], 
          /* arg1 */ js.UndefOr[IStats], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "stat", js.Any.fromFunction2(value))
  }
}
