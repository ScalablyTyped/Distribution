package typings.stylableCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object stylableTransformerMod {
  
  type postProcessor[T] = js.Function2[
    /* stylableResults */ typings.stylableCore.stylableTransformerMod.StylableResults, 
    /* transformer */ typings.stylableCore.stylableTransformerMod.StylableTransformer, 
    typings.stylableCore.stylableTransformerMod.StylableResults with T
  ]
  
  type replaceValueHook = js.Function4[
    /* value */ java.lang.String, 
    /* name */ java.lang.String | typings.stylableCore.anon.Args, 
    /* isLocal */ scala.Boolean, 
    /* passedThrough */ js.Array[java.lang.String], 
    java.lang.String
  ]
}
