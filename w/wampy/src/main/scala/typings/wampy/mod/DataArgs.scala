package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataArgs extends Args {
  var details: Dict
}

object DataArgs {
  @scala.inline
  def apply(argsDict: Dict, argsList: js.Array[_], details: Dict): DataArgs = {
    val __obj = js.Dynamic.literal(argsDict = argsDict.asInstanceOf[js.Any], argsList = argsList.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataArgs]
  }
}

