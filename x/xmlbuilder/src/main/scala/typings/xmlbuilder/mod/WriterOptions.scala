package typings.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options passed to the XML writer.
  */
@js.native
trait WriterOptions extends js.Object {
  /**
    * Whether to output closing tags for empty element nodes
    */
  var allowEmpty: js.UndefOr[Boolean] = js.native
  /**
    * Whether to pretty print text nodes
    */
  var dontPrettyTextNodes: js.UndefOr[Boolean] = js.native
  /**
    * Indentation string for pretty printing
    */
  var indent: js.UndefOr[String] = js.native
  /**
    * Newline string for pretty printing
    */
  var newline: js.UndefOr[String] = js.native
  /**
    * A fixed number of indents to offset strings
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Pretty print the XML tree
    */
  var pretty: js.UndefOr[Boolean] = js.native
  /**
    * A string to insert before closing slash character
    */
  var spaceBeforeSlash: js.UndefOr[String | Boolean] = js.native
  /**
    * The current state of the writer
    */
  var state: js.UndefOr[WriterState_] = js.native
  /**
    * User state object that is saved between writer functions
    */
  var user: js.UndefOr[js.Any] = js.native
  /**
    * Maximum column width
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Writer function overrides
    */
  var writer: js.UndefOr[XMLWriter] = js.native
}

object WriterOptions {
  @scala.inline
  def apply(): WriterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriterOptions]
  }
  @scala.inline
  implicit class WriterOptionsOps[Self <: WriterOptions] (val x: Self) extends AnyVal {
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
    def setAllowEmpty(value: Boolean): Self = this.set("allowEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEmpty: Self = this.set("allowEmpty", js.undefined)
    @scala.inline
    def setDontPrettyTextNodes(value: Boolean): Self = this.set("dontPrettyTextNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDontPrettyTextNodes: Self = this.set("dontPrettyTextNodes", js.undefined)
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setNewline(value: String): Self = this.set("newline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewline: Self = this.set("newline", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    @scala.inline
    def setSpaceBeforeSlash(value: String | Boolean): Self = this.set("spaceBeforeSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceBeforeSlash: Self = this.set("spaceBeforeSlash", js.undefined)
    @scala.inline
    def setState(value: WriterState_): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setUser(value: js.Any): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWriter(value: XMLWriter): Self = this.set("writer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriter: Self = this.set("writer", js.undefined)
  }
  
}

