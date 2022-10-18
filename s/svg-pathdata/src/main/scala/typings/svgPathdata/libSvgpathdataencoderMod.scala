package typings.svgPathdata

import typings.svgPathdata.libTypesMod.SVGCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSvgpathdataencoderMod {
  
  @JSImport("svg-pathdata/lib/SVGPathDataEncoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encodeSVGPath(commands: js.Array[SVGCommand]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSVGPath")(commands.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encodeSVGPath(commands: SVGCommand): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeSVGPath")(commands.asInstanceOf[js.Any]).asInstanceOf[String]
}
