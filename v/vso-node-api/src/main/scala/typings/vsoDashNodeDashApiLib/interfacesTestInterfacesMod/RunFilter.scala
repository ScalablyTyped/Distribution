package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunFilter extends js.Object {
  /**
    * filter for the test case sources (test containers)
    */
  var sourceFilter: java.lang.String
  /**
    * filter for the test cases
    */
  var testCaseFilter: java.lang.String
}

object RunFilter {
  @scala.inline
  def apply(sourceFilter: java.lang.String, testCaseFilter: java.lang.String): RunFilter = {
    val __obj = js.Dynamic.literal(sourceFilter = sourceFilter, testCaseFilter = testCaseFilter)
  
    __obj.asInstanceOf[RunFilter]
  }
}

