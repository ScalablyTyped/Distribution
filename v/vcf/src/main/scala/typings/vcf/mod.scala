package typings.vcf

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.vcf.vcfStrings.CarriagereturnLinefeed
import typings.vcf.vcfStrings.Dotvcf
import typings.vcf.vcfStrings.`2Dot1`
import typings.vcf.vcfStrings.`3Dot0`
import typings.vcf.vcfStrings.`4Dot0`
import typings.vcf.vcfStrings.vcard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vcf", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with vCard
  @JSImport("vcf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Is equal to `\r\n` */
  /* static member */
  @JSImport("vcf", "EOL")
  @js.native
  def EOL: CarriagereturnLinefeed = js.native
  inline def EOL_=(x: CarriagereturnLinefeed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EOL")(x.asInstanceOf[js.Any])
  
  @JSImport("vcf", "Property")
  @js.native
  open class Property protected () extends StObject {
    def this(field: String, value: String) = this()
    def this(field: String, value: String, params: StringDictionary[String | js.Array[String]]) = this()
    
    /** Check if the property is of a given type */
    def is(`type`: String): Boolean = js.native
    
    /** Check whether the property is empty */
    def isEmpty(): Boolean = js.native
    
    /** Returns a jCard formatted JSON object of just this property */
    def toJSON(): jCardProperty = js.native
    
    def toString(version: CardVersion): String = js.native
  }
  object Property {
    
    @JSImport("vcf", "Property")
    @js.native
    val ^ : js.Any = js.native
    
    /** Creates a property from a jCard formatted JSON object */
    /* static member */
    inline def fromJSON(data: jCardProperty): Property = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[Property]
  }
  
  /** is equal to `.vcf` */
  /* static member */
  @JSImport("vcf", "extension")
  @js.native
  val `extension`: Dotvcf = js.native
  
  /* static member */
  inline def foldLine(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("foldLine")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def foldLine(input: String, maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldLine")(input.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldLine(input: String, maxLength: Double, hardWrap: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldLine")(input.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], hardWrap.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def foldLine(input: String, maxLength: Unit, hardWrap: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("foldLine")(input.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], hardWrap.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def format(card: vCard): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(card.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(card: vCard, version: CardVersion): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(card.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /** Returns a vCard object from a jCard JSON object */
  /* static member */
  inline def fromJSON(jcard: jCard): vCard = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(jcard.asInstanceOf[js.Any]).asInstanceOf[vCard]
  
  /* static member */
  inline def isSupported(version: CardVersion): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(version.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Is equal to `text/vcard` */
  /* static member */
  @JSImport("vcf", "mimeType")
  @js.native
  def mimeType: String = js.native
  inline def mimeType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def normalize(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** Returns an *array* of vCard objects from a multiple-card string. */
  /* static member */
  inline def parse(value: String): js.Array[vCard] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[vCard]]
  inline def parse(value: Buffer): js.Array[vCard] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[vCard]]
  
  /* static member */
  inline def parseLines(lines: js.Array[String]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLines")(lines.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* static member */
  @JSImport("vcf", "versions")
  @js.native
  def versions: js.Tuple3[`2Dot1`, `3Dot0`, `4Dot0`] = js.native
  inline def versions_=(x: js.Tuple3[`2Dot1`, `3Dot0`, `4Dot0`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versions")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typings.vcf.vcfStrings.`2Dot1`
    - typings.vcf.vcfStrings.`3Dot0`
    - typings.vcf.vcfStrings.`4Dot0`
  */
  trait CardVersion extends StObject
  object CardVersion {
    
    inline def `2Dot1`: typings.vcf.vcfStrings.`2Dot1` = "2.1".asInstanceOf[typings.vcf.vcfStrings.`2Dot1`]
    
    inline def `3Dot0`: typings.vcf.vcfStrings.`3Dot0` = "3.0".asInstanceOf[typings.vcf.vcfStrings.`3Dot0`]
    
    inline def `4Dot0`: typings.vcf.vcfStrings.`4Dot0` = "4.0".asInstanceOf[typings.vcf.vcfStrings.`4Dot0`]
  }
  
  /** jCard standard format */
  type jCard = js.Tuple2[vcard, js.Array[jCardProperty]]
  
  type jCardProperty = js.Tuple4[String, StringDictionary[String | js.Array[String]], String, String | js.Array[String]]
  
  @js.native
  trait vCard extends StObject {
    
    /** Add a vCard property  */
    def add(key: String, value: String): vCard = js.native
    def add(key: String, value: String, params: StringDictionary[String | js.Array[String]]): vCard = js.native
    
    /** Add a vCard property  */
    def addProperty(prop: Property): vCard = js.native
    
    var data: StringDictionary[Property | js.Array[Property]] = js.native
    
    /** Get a vCard property */
    def get(key: String): Property | js.Array[Property] = js.native
    
    /** Parse a vcf formatted vCard */
    def parse(value: String): vCard = js.native
    def parse(value: Buffer): vCard = js.native
    
    /** Set a vCard property */
    def set(key: String, value: String): vCard = js.native
    def set(key: String, value: String, params: StringDictionary[String | js.Array[String]]): vCard = js.native
    
    /** Set a vCard property */
    def setProperty(prop: Property): vCard = js.native
    
    /** Returns a formatted jCard JSON object */
    def toJCard(): jCard = js.native
    def toJCard(version: CardVersion): jCard = js.native
    
    /** Returns a formatted jCard JSON object */
    def toJSON(): jCard = js.native
    
    def toString(version: Unit, charset: String): String = js.native
    def toString(version: CardVersion): String = js.native
    def toString(version: CardVersion, charset: String): String = js.native
    
    var version: CardVersion = js.native
  }
}
