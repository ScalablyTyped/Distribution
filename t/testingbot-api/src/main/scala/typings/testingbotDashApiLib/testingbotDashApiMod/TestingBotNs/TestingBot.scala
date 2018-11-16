package typings
package testingbotDashApiLib.testingbotDashApiMod.TestingBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestingBot extends js.Object {
  def deleteLabTest(testID: java.lang.String): scala.Unit = js.native
  def deleteLabTest(testID: java.lang.String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): scala.Unit = js.native
  def deleteTest(testID: java.lang.String): scala.Unit = js.native
  def deleteTest(testID: java.lang.String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): scala.Unit = js.native
  def getBrowsers(): scala.Unit = js.native
  def getBrowsers(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): scala.Unit = js.native
  def getBrowsers(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _], `type`: BrowserType): scala.Unit = js.native
  def getLabTestDetails(testID: java.lang.String): scala.Unit = js.native
  def getLabTestDetails(testID: java.lang.String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): scala.Unit = js.native
  def getLabTests(): scala.Unit = js.native
  def getLabTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): scala.Unit = js.native
  def getLabTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _], offset: scala.Double): scala.Unit = js.native
  def getLabTests(
    callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _],
    offset: scala.Double,
    limit: scala.Double
  ): scala.Unit = js.native
  def getTestDetails(testID: java.lang.String): scala.Unit = js.native
  def getTestDetails(testID: java.lang.String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): scala.Unit = js.native
  def getTests(): scala.Unit = js.native
  def getTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): scala.Unit = js.native
  def getTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _], offset: scala.Double): scala.Unit = js.native
  def getTests(
    callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _],
    offset: scala.Double,
    limit: scala.Double
  ): scala.Unit = js.native
  def getTunnel(): scala.Unit = js.native
  def getTunnel(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): scala.Unit = js.native
  def getUserInfo(): scala.Unit = js.native
  def getUserInfo(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): scala.Unit = js.native
  def updateLabTest(data: TestLabData, testID: java.lang.String): scala.Unit = js.native
  def updateLabTest(
    data: TestLabData,
    testID: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]
  ): scala.Unit = js.native
  def updateTest(data: TestData, testID: java.lang.String): scala.Unit = js.native
  def updateTest(
    data: TestData,
    testID: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]
  ): scala.Unit = js.native
  def updateUserInfo(data: UserInfo): scala.Unit = js.native
  def updateUserInfo(data: UserInfo, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): scala.Unit = js.native
}

