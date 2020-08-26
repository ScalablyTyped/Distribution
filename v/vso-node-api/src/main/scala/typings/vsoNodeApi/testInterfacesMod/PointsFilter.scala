package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointsFilter extends js.Object {
  var configurationNames: js.Array[String] = js.native
  var testcaseIds: js.Array[Double] = js.native
  var testers: js.Array[IdentityRef] = js.native
}

object PointsFilter {
  @scala.inline
  def apply(
    configurationNames: js.Array[String],
    testcaseIds: js.Array[Double],
    testers: js.Array[IdentityRef]
  ): PointsFilter = {
    val __obj = js.Dynamic.literal(configurationNames = configurationNames.asInstanceOf[js.Any], testcaseIds = testcaseIds.asInstanceOf[js.Any], testers = testers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointsFilter]
  }
  @scala.inline
  implicit class PointsFilterOps[Self <: PointsFilter] (val x: Self) extends AnyVal {
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
    def setConfigurationNamesVarargs(value: String*): Self = this.set("configurationNames", js.Array(value :_*))
    @scala.inline
    def setConfigurationNames(value: js.Array[String]): Self = this.set("configurationNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestcaseIdsVarargs(value: Double*): Self = this.set("testcaseIds", js.Array(value :_*))
    @scala.inline
    def setTestcaseIds(value: js.Array[Double]): Self = this.set("testcaseIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestersVarargs(value: IdentityRef*): Self = this.set("testers", js.Array(value :_*))
    @scala.inline
    def setTesters(value: js.Array[IdentityRef]): Self = this.set("testers", value.asInstanceOf[js.Any])
  }
  
}

