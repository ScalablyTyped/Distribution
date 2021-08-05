package typings.vegaLite

import typings.vegaLite.anon.Size
import typings.vegaLite.specBaseMod.LayoutSizeMixins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initMod {
  
  @JSImport("vega-lite/build/src/compile/layoutsize/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initLayoutSize(hasEncodingSize: Size): LayoutSizeMixins = ^.asInstanceOf[js.Dynamic].applyDynamic("initLayoutSize")(hasEncodingSize.asInstanceOf[js.Any]).asInstanceOf[LayoutSizeMixins]
}
