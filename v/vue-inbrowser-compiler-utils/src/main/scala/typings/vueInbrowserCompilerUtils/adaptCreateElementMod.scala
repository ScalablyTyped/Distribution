package typings.vueInbrowserCompilerUtils

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-inbrowser-compiler-utils/lib/adaptCreateElement", JSImport.Namespace)
@js.native
object adaptCreateElementMod extends js.Object {
  
  def concatenate(src: StringDictionary[js.Any], otherObj: StringDictionary[js.Any]*): StringDictionary[js.Any] = js.native
  
  def default(h: CreateElementFunction): CreateElementFunction = js.native
  
  type CreateElementFunction = js.Function3[
    /* component */ String | js.Object, 
    /* attributes */ js.UndefOr[StringDictionary[js.Any]], 
    /* children */ js.UndefOr[js.Any | js.Array[js.Any]], 
    js.Array[js.Any] | js.Any
  ]
}
