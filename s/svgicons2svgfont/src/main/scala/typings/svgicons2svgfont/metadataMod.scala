package typings.svgicons2svgfont

import typings.svgicons2svgfont.mod.MetadataOptions
import typings.svgicons2svgfont.mod.MetadataProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  inline def apply(): MetadataProvider = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[MetadataProvider]
  inline def apply(options: MetadataOptions): MetadataProvider = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[MetadataProvider]
  
  @JSImport("svgicons2svgfont/src/metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
