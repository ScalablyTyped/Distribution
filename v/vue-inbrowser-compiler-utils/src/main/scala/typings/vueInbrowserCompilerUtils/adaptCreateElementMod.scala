package typings.vueInbrowserCompilerUtils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adaptCreateElementMod {
  
  @JSImport("vue-inbrowser-compiler-utils/lib/adaptCreateElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(h: CreateElementFunction): CreateElementFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(h.asInstanceOf[js.Any]).asInstanceOf[CreateElementFunction]
  
  @scala.inline
  def concatenate(src: StringDictionary[js.Any], otherObj: StringDictionary[js.Any]*): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(src.asInstanceOf[js.Any], otherObj.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  type CreateElementFunction = js.Function3[
    /* component */ String | js.Object, 
    /* attributes */ js.UndefOr[StringDictionary[js.Any]], 
    /* children */ js.UndefOr[js.Any | js.Array[js.Any]], 
    js.Array[js.Any] | js.Any
  ]
}
