package typings.vueInbrowserCompilerUtils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adaptCreateElementMod {
  
  @JSImport("vue-inbrowser-compiler-utils/lib/adaptCreateElement", JSImport.Default)
  @js.native
  def default(h: CreateElementFunction): CreateElementFunction = js.native
  
  @JSImport("vue-inbrowser-compiler-utils/lib/adaptCreateElement", "concatenate")
  @js.native
  def concatenate(src: StringDictionary[js.Any], otherObj: StringDictionary[js.Any]*): StringDictionary[js.Any] = js.native
  
  type CreateElementFunction = js.Function3[
    /* component */ String | js.Object, 
    /* attributes */ js.UndefOr[StringDictionary[js.Any]], 
    /* children */ js.UndefOr[js.Any | js.Array[js.Any]], 
    js.Array[js.Any] | js.Any
  ]
}
