package typings.uaParserJs.IUAParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEngine extends js.Object {
  /**
    * Possible name:
    * Amaya, EdgeHTML, Gecko, iCab, KHTML, Links, Lynx, NetFront, NetSurf, Presto,
    * Tasman, Trident, w3m, WebKit
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Determined dynamically
    */
  var version: js.UndefOr[String] = js.native
}

object IEngine {
  @scala.inline
  def apply(): IEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEngine]
  }
  @scala.inline
  implicit class IEngineOps[Self <: IEngine] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

