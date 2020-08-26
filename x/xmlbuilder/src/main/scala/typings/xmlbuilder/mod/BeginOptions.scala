package typings.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options used while creating an XML document with the `begin`
  * function.
  */
@js.native
trait BeginOptions extends js.Object {
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
    * Whether attributes with null values will be kept or ignored
    */
  var keepNullAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Whether nodes with null values will be kept or ignored
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
    * Whether array items are created as separate nodes when passed 
    * as an object value
    */
  var separateArrayItems: js.UndefOr[Boolean] = js.native
  /**
    * A set of functions to use for converting values to strings
    */
  var stringify: js.UndefOr[XMLStringifier] = js.native
  /** 
    * The default XML writer to use for converting nodes to string. 
    * If the default writer is not set, the built-in XMLStringWriter 
    * will be used instead. 
    */
  var writer: js.UndefOr[XMLWriter | WriterOptions] = js.native
}

object BeginOptions {
  @scala.inline
  def apply(): BeginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginOptions]
  }
  @scala.inline
  implicit class BeginOptionsOps[Self <: BeginOptions] (val x: Self) extends AnyVal {
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
    def setSeparateArrayItems(value: Boolean): Self = this.set("separateArrayItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparateArrayItems: Self = this.set("separateArrayItems", js.undefined)
    @scala.inline
    def setStringify(value: XMLStringifier): Self = this.set("stringify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringify: Self = this.set("stringify", js.undefined)
    @scala.inline
    def setWriter(value: XMLWriter | WriterOptions): Self = this.set("writer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriter: Self = this.set("writer", js.undefined)
  }
  
}

