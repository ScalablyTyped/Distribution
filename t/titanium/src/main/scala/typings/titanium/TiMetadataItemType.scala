package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An abstract type to represent a metadata item inside the `metadata` event (iOS only).
  */
@js.native
trait TiMetadataItemType extends js.Object {
  /**
    * A dictionary of the additional attributes.
    */
  var extraAttributes: js.UndefOr[js.Any] = js.native
  /**
    * The key of the metadata item, e.g. "title".
    */
  var key: js.UndefOr[java.lang.String] = js.native
  /**
    * The key-path of the metadata item.
    */
  var keySpace: js.UndefOr[java.lang.String] = js.native
  /**
    * The value of the metadata item. Can be represented as various types.
    */
  var value: js.UndefOr[java.lang.String | Double | Boolean] = js.native
}

object TiMetadataItemType {
  @scala.inline
  def apply(): TiMetadataItemType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TiMetadataItemType]
  }
  @scala.inline
  implicit class TiMetadataItemTypeOps[Self <: TiMetadataItemType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtraAttributes(value: js.Any): Self = this.set("extraAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraAttributes: Self = this.set("extraAttributes", js.undefined)
    @scala.inline
    def setKey(value: java.lang.String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeySpace(value: java.lang.String): Self = this.set("keySpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySpace: Self = this.set("keySpace", js.undefined)
    @scala.inline
    def setValue(value: java.lang.String | Double | Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

