package typings.xmldsigjs

import typings.std.Uint8Array
import typings.xmlCore.mod.XmlCollection
import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/reference", JSImport.Namespace)
@js.native
object referenceMod extends js.Object {
  @js.native
  class Reference () extends XmlObject {
    def this(uri: String) = this()
    /**
      * Gets or sets the digest method Uniform Resource Identifier (URI) of the current
      */
    var DigestMethod: typings.xmldsigjs.digestMethodMod.DigestMethod = js.native
    /**
      * Gets or sets the digest value of the current Reference.
      */
    var DigestValue: Uint8Array = js.native
    /**
      * Gets or sets the ID of the current Reference.
      */
    var Id: String = js.native
    var Transforms: typings.xmldsigjs.transformCollectionMod.Transforms = js.native
    /**
      * Gets or sets the type of the object being signed.
      */
    var Type: String = js.native
    /**
      * Gets or sets the Uri of the current Reference.
      */
    var Uri: js.UndefOr[String] = js.native
  }
  
  @js.native
  class References () extends XmlCollection[Reference]
  
}

