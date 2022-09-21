package typings.websequencediagrams

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("websequencediagrams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** @async */
  inline def diagram(message: String): js.Promise[DiagramTuple] = ^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DiagramTuple]]
  inline def diagram(message: String, style: Unit, format: OutputType): js.Promise[DiagramTuple] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagramTuple]]
  inline def diagram(message: String, style: Style): js.Promise[DiagramTuple] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagramTuple]]
  inline def diagram(message: String, style: Style, format: OutputType): js.Promise[DiagramTuple] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagramTuple]]
  inline def diagram(message: Buffer): js.Promise[DiagramTuple] = ^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DiagramTuple]]
  inline def diagram(message: Buffer, style: Unit, format: OutputType): js.Promise[DiagramTuple] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagramTuple]]
  inline def diagram(message: Buffer, style: Style): js.Promise[DiagramTuple] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagramTuple]]
  inline def diagram(message: Buffer, style: Style, format: OutputType): js.Promise[DiagramTuple] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagram")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DiagramTuple]]
  
  /** @async */
  inline def diagramURL(message: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def diagramURL(message: String, style: Unit, format: OutputType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def diagramURL(message: String, style: Style): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def diagramURL(message: String, style: Style, format: OutputType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def diagramURL(message: Buffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def diagramURL(message: Buffer, style: Unit, format: OutputType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def diagramURL(message: Buffer, style: Style): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def diagramURL(message: Buffer, style: Style, format: OutputType): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagramURL")(message.asInstanceOf[js.Any], style.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("websequencediagrams", "root")
  @js.native
  def root: String = js.native
  inline def root_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("root")(x.asInstanceOf[js.Any])
  
  @JSImport("websequencediagrams", "styles")
  @js.native
  def styles: js.Array[Style] = js.native
  inline def styles_=(x: js.Array[Style]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styles")(x.asInstanceOf[js.Any])
  
  type DiagramTuple = js.Tuple2[Buffer, String]
  
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
    - typings.websequencediagrams.websequencediagramsStrings.magazine
    - typings.websequencediagrams.websequencediagramsStrings.`modern-blue`
    - typings.websequencediagrams.websequencediagramsStrings.mscgenComma
    - typings.websequencediagrams.websequencediagramsStrings.napkin
    - typings.websequencediagrams.websequencediagramsStrings.omegapple
    - typings.websequencediagrams.websequencediagramsStrings.patent
    - typings.websequencediagrams.websequencediagramsStrings.qsd
    - typings.websequencediagrams.websequencediagramsStrings.rose
    - typings.websequencediagrams.websequencediagramsStrings.roundgreen
    - typings.websequencediagrams.websequencediagramsStrings.vs2010
  */
  trait Style extends StObject
  object Style {
    
    inline def default: typings.websequencediagrams.websequencediagramsStrings.default = "default".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.default]
    
    inline def earth: typings.websequencediagrams.websequencediagramsStrings.earth = "earth".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.earth]
    
    inline def magazine: typings.websequencediagrams.websequencediagramsStrings.magazine = "magazine".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.magazine]
    
    inline def `modern-blue`: typings.websequencediagrams.websequencediagramsStrings.`modern-blue` = "modern-blue".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.`modern-blue`]
    
    inline def mscgenComma: typings.websequencediagrams.websequencediagramsStrings.mscgenComma = "mscgen,".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.mscgenComma]
    
    inline def napkin: typings.websequencediagrams.websequencediagramsStrings.napkin = "napkin".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.napkin]
    
    inline def omegapple: typings.websequencediagrams.websequencediagramsStrings.omegapple = "omegapple".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.omegapple]
    
    inline def patent: typings.websequencediagrams.websequencediagramsStrings.patent = "patent".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.patent]
    
    inline def qsd: typings.websequencediagrams.websequencediagramsStrings.qsd = "qsd".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.qsd]
    
    inline def rose: typings.websequencediagrams.websequencediagramsStrings.rose = "rose".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.rose]
    
    inline def roundgreen: typings.websequencediagrams.websequencediagramsStrings.roundgreen = "roundgreen".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.roundgreen]
    
    inline def vs2010: typings.websequencediagrams.websequencediagramsStrings.vs2010 = "vs2010".asInstanceOf[typings.websequencediagrams.websequencediagramsStrings.vs2010]
  }
}
