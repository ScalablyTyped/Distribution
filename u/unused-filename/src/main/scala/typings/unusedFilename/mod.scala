package typings.unusedFilename

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unused-filename", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("unused-filename", "MaxTryError")
  @js.native
  open class MaxTryError protected ()
    extends StObject
       with Error {
    def this(originalPath: String, lastTriedPath: String) = this()
    
    var lastTriedPath: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var originalPath: String = js.native
  }
  
  inline def separatorIncrementer(separator: String): Incrementer = ^.asInstanceOf[js.Dynamic].applyDynamic("separatorIncrementer")(separator.asInstanceOf[js.Any]).asInstanceOf[Incrementer]
  
  inline def unusedFilename(filePath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("unusedFilename")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def unusedFilename(filePath: String, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unusedFilename")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def unusedFilenameSync(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unusedFilenameSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unusedFilenameSync(filePath: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unusedFilenameSync")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Incrementer = js.Function2[/* filename */ String, /* extension */ String, js.Tuple2[String, String]]
  
  trait Options extends StObject {
    
    /**
    	A function that accepts a file path, and increments its index.
    	It's the incrementer's responsibility to extract an already existing index from the given file path so that it picks up and continues incrementing an already present index instead of appending a second one.
    	The incrementer has to return a tuple of `[originalFilename, incrementedFilename]`, where `originalFilename` is the filename without the index, and `incrementedFilename` is a filename with input's index bumped by one.
    	Default: Parentheses incrementer: `file.txt` → `file (1).txt`
    	@example
    	```
    	import {unusedFilename} from 'unused-filename';
    	// Incrementer that inserts a new index as a prefix.
    	const prefixIncrementer = (filename, extension) => {
    		const match = filename.match(/^(?<index>\d+)_(?<originalFilename>.*)$/);
    		let {originalFilename, index} = match ? match.groups : {originalFilename: filename, index: 0};
    		originalFilename = originalFilename.trim();
    		return [`${originalFilename}${extension}`, `${++index}_${originalFilename}${extension}`];
    	};
    	console.log(await unusedFilename('rainbow.txt', {incrementer: prefixIncrementer}));
    	//=> '1_rainbow.txt'
    	```
    	*/
    val incrementer: js.UndefOr[Incrementer] = js.undefined
    
    /**
    	The maximum number of attempts to find an unused filename.
    	When the limit is reached, the function will throw `MaxTryError`.
    	@default Infinity
    	*/
    val maxTries: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIncrementer(value: (/* filename */ String, /* extension */ String) => js.Tuple2[String, String]): Self = StObject.set(x, "incrementer", js.Any.fromFunction2(value))
      
      inline def setIncrementerUndefined: Self = StObject.set(x, "incrementer", js.undefined)
      
      inline def setMaxTries(value: Double): Self = StObject.set(x, "maxTries", value.asInstanceOf[js.Any])
      
      inline def setMaxTriesUndefined: Self = StObject.set(x, "maxTries", js.undefined)
    }
  }
}
