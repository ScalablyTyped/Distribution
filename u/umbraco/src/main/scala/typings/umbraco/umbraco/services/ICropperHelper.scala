package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.cropperHelper
  * @description A helper object used for dealing with image cropper data
  */
@js.native
trait ICropperHelper extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.services.cropperHelper#configuration
    * @methodOf umbraco.services.cropperHelper
    *
    * @description
    * Returns a collection of plugins available to the tinyMCE editor
    *
    */
  def configuration(mediaTypeAlias: String): js.Any = js.native
}

object ICropperHelper {
  @scala.inline
  def apply(configuration: String => js.Any): ICropperHelper = {
    val __obj = js.Dynamic.literal(configuration = js.Any.fromFunction1(configuration))
    __obj.asInstanceOf[ICropperHelper]
  }
  @scala.inline
  implicit class ICropperHelperOps[Self <: ICropperHelper] (val x: Self) extends AnyVal {
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
    def setConfiguration(value: String => js.Any): Self = this.set("configuration", js.Any.fromFunction1(value))
  }
  
}

