package typings.vueInbrowserCompilerUtils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adaptCreateElementMod {
  
  @JSImport("vue-inbrowser-compiler-utils/lib/types/adaptCreateElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(h: CreateElementFunction): CreateElementFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(h.asInstanceOf[js.Any]).asInstanceOf[CreateElementFunction]
  
  inline def concatenate(src: StringDictionary[Any], otherObj: StringDictionary[Any]*): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(scala.List(src.asInstanceOf[js.Any]).`++`(otherObj.asInstanceOf[Seq[js.Any]])*).asInstanceOf[StringDictionary[Any]]
  
  type CreateElementFunction = js.Function3[
    /* component */ String | js.Object, 
    /* attributes */ js.UndefOr[StringDictionary[Any]], 
    /* children */ js.UndefOr[Any | js.Array[Any]], 
    js.Array[Any] | Any
  ]
}
