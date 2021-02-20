package typings.vcf

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.vcf.vcfStrings.CarriagereturnLinefeed
import typings.vcf.vcfStrings.Dotvcf
import typings.vcf.vcfStrings.`2Dot1`
import typings.vcf.vcfStrings.`3Dot0`
import typings.vcf.vcfStrings.`4Dot0`
import typings.vcf.vcfStrings.vcard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vcf", JSImport.Namespace)
  @js.native
  class ^ () extends vCard
  @JSImport("vcf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Is equal to `\r\n` */
  /* static member */
  @JSImport("vcf", "EOL")
  @js.native
  def EOL: CarriagereturnLinefeed = js.native
  @scala.inline
  def EOL_=(x: CarriagereturnLinefeed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EOL")(x.asInstanceOf[js.Any])
  
  @JSImport("vcf", "Property")
  @js.native
  class Property protected () extends StObject {
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
    
    /** Creates a property from a jCard formatted JSON object */
    /* static member */
    @JSImport("vcf", "Property.fromJSON")
    @js.native
    def fromJSON(data: jCardProperty): Property = js.native
  }
  
  /** is equal to `.vcf` */
  /* static member */
  @JSImport("vcf", "extension")
  @js.native
  def extension: Dotvcf = js.native
  @scala.inline
  def extension_=(x: Dotvcf): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extension")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vcf", "foldLine")
  @js.native
  def foldLine(input: String): String = js.native
  @JSImport("vcf", "foldLine")
  @js.native
  def foldLine(input: String, maxLength: js.UndefOr[scala.Nothing], hardWrap: Boolean): String = js.native
  @JSImport("vcf", "foldLine")
  @js.native
  def foldLine(input: String, maxLength: Double): String = js.native
  @JSImport("vcf", "foldLine")
  @js.native
  def foldLine(input: String, maxLength: Double, hardWrap: Boolean): String = js.native
  
  /* static member */
  @JSImport("vcf", "format")
  @js.native
  def format(card: vCard): String = js.native
  @JSImport("vcf", "format")
  @js.native
  def format(card: vCard, version: CardVersion): String = js.native
  
  /** Returns a vCard object from a jCard JSON object */
  /* static member */
  @JSImport("vcf", "fromJSON")
  @js.native
  def fromJSON(jcard: jCard): vCard = js.native
  
  /* static member */
  @JSImport("vcf", "isSupported")
  @js.native
  def isSupported(version: CardVersion): Boolean = js.native
  
  /** Is equal to `text/vcard` */
  /* static member */
  @JSImport("vcf", "mimeType")
  @js.native
  def mimeType: String = js.native
  @scala.inline
  def mimeType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("vcf", "normalize")
  @js.native
  def normalize(input: String): String = js.native
  
  /** Returns an *array* of vCard objects from a multiple-card string. */
  /* static member */
  @JSImport("vcf", "parse")
  @js.native
  def parse(value: String): js.Array[vCard] = js.native
  @JSImport("vcf", "parse")
  @js.native
  def parse(value: Buffer): js.Array[vCard] = js.native
  
  /* static member */
  @JSImport("vcf", "parseLines")
  @js.native
  def parseLines(lines: js.Array[String]): js.Any = js.native
  
  /* static member */
  @JSImport("vcf", "versions")
  @js.native
  def versions: js.Tuple3[`2Dot1`, `3Dot0`, `4Dot0`] = js.native
  @scala.inline
  def versions_=(x: js.Tuple3[`2Dot1`, `3Dot0`, `4Dot0`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versions")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typings.vcf.vcfStrings.`2Dot1`
    - typings.vcf.vcfStrings.`3Dot0`
    - typings.vcf.vcfStrings.`4Dot0`
  */
  trait CardVersion extends StObject
  object CardVersion {
    
    @scala.inline
    def `2Dot1`: typings.vcf.vcfStrings.`2Dot1` = "2.1".asInstanceOf[typings.vcf.vcfStrings.`2Dot1`]
    
    @scala.inline
    def `3Dot0`: typings.vcf.vcfStrings.`3Dot0` = "3.0".asInstanceOf[typings.vcf.vcfStrings.`3Dot0`]
    
    @scala.inline
    def `4Dot0`: typings.vcf.vcfStrings.`4Dot0` = "4.0".asInstanceOf[typings.vcf.vcfStrings.`4Dot0`]
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
    
    def toString(version: js.UndefOr[scala.Nothing], charset: String): String = js.native
    def toString(version: CardVersion): String = js.native
    def toString(version: CardVersion, charset: String): String = js.native
    
    var version: CardVersion = js.native
  }
}
