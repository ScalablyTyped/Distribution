package typings.websequencediagrams

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("websequencediagrams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def diagram(description: String, style: Null, format: Null, callback: diagramCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diagram(description: String, style: Null, format: OutputType, callback: diagramCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diagram(description: String, style: Style, format: Null, callback: diagramCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diagram(description: String, style: Style, format: OutputType, callback: diagramCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diagram(description: Buffer, style: Null, format: Null, callback: diagramCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diagram(description: Buffer, style: Null, format: OutputType, callback: diagramCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diagram(description: Buffer, style: Style, format: Null, callback: diagramCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diagram(description: Buffer, style: Style, format: OutputType, callback: diagramCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def diagramUrl(description: String, style: Null, format: Null, callback: diagramUrlCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram_url")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diagramUrl(description: String, style: Null, format: OutputType, callback: diagramUrlCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram_url")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diagramUrl(description: String, style: Style, format: Null, callback: diagramUrlCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram_url")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diagramUrl(description: String, style: Style, format: OutputType, callback: diagramUrlCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram_url")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diagramUrl(description: Buffer, style: Null, format: Null, callback: diagramUrlCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram_url")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diagramUrl(description: Buffer, style: Null, format: OutputType, callback: diagramUrlCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram_url")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diagramUrl(description: Buffer, style: Style, format: Null, callback: diagramUrlCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram_url")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diagramUrl(description: Buffer, style: Style, format: OutputType, callback: diagramUrlCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram_url")(description.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("websequencediagrams", "root")
  @js.native
  val root: String = js.native
  
  @JSImport("websequencediagrams", "styles")
  @js.native
  val styles: js.Array[Style] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.websequencediagrams.websequencediagramsStrings.png
    - typings.websequencediagrams.websequencediagramsStrings.svg
    - typings.websequencediagrams.websequencediagramsStrings.pdf
  */
  trait OutputType extends StObject
  object OutputType {
    
    inline def pdf: typings.websequencediagrams.websequencediagramsStrings.pdf = "pdf".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.pdf]
    
    inline def png: typings.websequencediagrams.websequencediagramsStrings.png = "png".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.png]
    
    inline def svg: typings.websequencediagrams.websequencediagramsStrings.svg = "svg".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.svg]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.websequencediagrams.websequencediagramsStrings.default
    - typings.websequencediagrams.websequencediagramsStrings.earth
    - typings.websequencediagrams.websequencediagramsStrings.`modern-blue`
    - typings.websequencediagrams.websequencediagramsStrings.mscgen
    - typings.websequencediagrams.websequencediagramsStrings.omegapple
    - typings.websequencediagrams.websequencediagramsStrings.qsd
    - typings.websequencediagrams.websequencediagramsStrings.rose
    - typings.websequencediagrams.websequencediagramsStrings.roundgreen
    - typings.websequencediagrams.websequencediagramsStrings.napkin
    - typings.websequencediagrams.websequencediagramsStrings.magazine
    - typings.websequencediagrams.websequencediagramsStrings.vs2010
    - typings.websequencediagrams.websequencediagramsStrings.patent
  */
  trait Style extends StObject
  object Style {
    
    inline def default: typings.websequencediagrams.websequencediagramsStrings.default = "default".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.default]
    
    inline def earth: typings.websequencediagrams.websequencediagramsStrings.earth = "earth".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.earth]
    
    inline def magazine: typings.websequencediagrams.websequencediagramsStrings.magazine = "magazine".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.magazine]
    
    inline def `modern-blue`: typings.websequencediagrams.websequencediagramsStrings.`modern-blue` = "modern-blue".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.`modern-blue`]
    
    inline def mscgen: typings.websequencediagrams.websequencediagramsStrings.mscgen = "mscgen".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.mscgen]
    
    inline def napkin: typings.websequencediagrams.websequencediagramsStrings.napkin = "napkin".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.napkin]
    
    inline def omegapple: typings.websequencediagrams.websequencediagramsStrings.omegapple = "omegapple".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.omegapple]
    
    inline def patent: typings.websequencediagrams.websequencediagramsStrings.patent = "patent".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.patent]
    
    inline def qsd: typings.websequencediagrams.websequencediagramsStrings.qsd = "qsd".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.qsd]
    
    inline def rose: typings.websequencediagrams.websequencediagramsStrings.rose = "rose".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.rose]
    
    inline def roundgreen: typings.websequencediagrams.websequencediagramsStrings.roundgreen = "roundgreen".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.roundgreen]
    
    inline def vs2010: typings.websequencediagrams.websequencediagramsStrings.vs2010 = "vs2010".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.vs2010]
  }
  
  type diagramCallback = js.Function3[
    /* error */ Error | Null, 
    /* buffer */ js.UndefOr[Buffer], 
    /* mimeType */ js.UndefOr[String], 
    Unit
  ]
  
  type diagramUrlCallback = js.Function2[/* error */ Error | Null, /* url */ js.UndefOr[String], Unit]
}
