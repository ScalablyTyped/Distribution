package typings.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options used while creating an XML document with the `create`
  * function.
  */
@js.native
trait CreateOptions extends js.Object {
  /**
    * Encoding declaration, e.g. `UTF-8`
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * Whether XML declaration and doctype will be included
    */
  var headless: js.UndefOr[Boolean] = js.native
  /** 
    * Whether decorator strings will be ignored when converting JS 
    * objects
    */
  var ignoreDecorators: js.UndefOr[Boolean] = js.native
  /**
    * A character to replace invalid characters in all values. This also
    * disables character validation.
    */
  var invalidCharReplacement: js.UndefOr[String] = js.native
  /**
    * Whether attributes with `null` values will be kept or ignored
    */
  var keepNullAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Whether nodes with `null` values will be kept or ignored
    */
  var keepNullNodes: js.UndefOr[Boolean] = js.native
  /**
    * Whether existing html entities are encoded
    */
  var noDoubleEncoding: js.UndefOr[Boolean] = js.native
  /**
    * Whether values will be validated and escaped or returned as is
    */
  var noValidation: js.UndefOr[Boolean] = js.native
  /**
    * Public identifier of the DTD
    */
  var pubID: js.UndefOr[String] = js.native
  /** 
    * Whether array items are created as separate nodes when passed 
    * as an object value
    */
  var separateArrayItems: js.UndefOr[Boolean] = js.native
  /**
    * Standalone document declaration: `true` or `false`
    */
  var standalone: js.UndefOr[Boolean] = js.native
  /**
    * A set of functions to use for converting values to strings
    */
  var stringify: js.UndefOr[XMLStringifier] = js.native
  /**
    * System identifier of the DTD
    */
  var sysID: js.UndefOr[String] = js.native
  /**
    * A version number string, e.g. `1.0`
    */
  var version: js.UndefOr[String] = js.native
  /** 
    * The default XML writer to use for converting nodes to string. 
    * If the default writer is not set, the built-in `XMLStringWriter` 
    * will be used instead. 
    */
  var writer: js.UndefOr[XMLWriter] = js.native
}

object CreateOptions {
  @scala.inline
  def apply(): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOptions]
  }
  @scala.inline
  implicit class CreateOptionsOps[Self <: CreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setHeadless(value: Boolean): Self = this.set("headless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadless: Self = this.set("headless", js.undefined)
    @scala.inline
    def setIgnoreDecorators(value: Boolean): Self = this.set("ignoreDecorators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreDecorators: Self = this.set("ignoreDecorators", js.undefined)
    @scala.inline
    def setInvalidCharReplacement(value: String): Self = this.set("invalidCharReplacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidCharReplacement: Self = this.set("invalidCharReplacement", js.undefined)
    @scala.inline
    def setKeepNullAttributes(value: Boolean): Self = this.set("keepNullAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepNullAttributes: Self = this.set("keepNullAttributes", js.undefined)
    @scala.inline
    def setKeepNullNodes(value: Boolean): Self = this.set("keepNullNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepNullNodes: Self = this.set("keepNullNodes", js.undefined)
    @scala.inline
    def setNoDoubleEncoding(value: Boolean): Self = this.set("noDoubleEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDoubleEncoding: Self = this.set("noDoubleEncoding", js.undefined)
    @scala.inline
    def setNoValidation(value: Boolean): Self = this.set("noValidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoValidation: Self = this.set("noValidation", js.undefined)
    @scala.inline
    def setPubID(value: String): Self = this.set("pubID", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubID: Self = this.set("pubID", js.undefined)
    @scala.inline
    def setSeparateArrayItems(value: Boolean): Self = this.set("separateArrayItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparateArrayItems: Self = this.set("separateArrayItems", js.undefined)
    @scala.inline
    def setStandalone(value: Boolean): Self = this.set("standalone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandalone: Self = this.set("standalone", js.undefined)
    @scala.inline
    def setStringify(value: XMLStringifier): Self = this.set("stringify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringify: Self = this.set("stringify", js.undefined)
    @scala.inline
    def setSysID(value: String): Self = this.set("sysID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSysID: Self = this.set("sysID", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setWriter(value: XMLWriter): Self = this.set("writer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriter: Self = this.set("writer", js.undefined)
  }
  
}

