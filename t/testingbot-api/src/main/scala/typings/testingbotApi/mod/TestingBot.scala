package typings.testingbotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestingBot extends js.Object {
  def deleteLabTest(testID: String): Unit = js.native
  def deleteLabTest(testID: String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
  def deleteTest(testID: String): Unit = js.native
  def deleteTest(testID: String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
  def getBrowsers(): Unit = js.native
  def getBrowsers(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
  def getBrowsers(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _], `type`: BrowserType): Unit = js.native
  def getLabTestDetails(testID: String): Unit = js.native
  def getLabTestDetails(testID: String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
  def getLabTests(): Unit = js.native
  def getLabTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
  def getLabTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _], offset: Double): Unit = js.native
  def getLabTests(
    callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _],
    offset: Double,
    limit: Double
  ): Unit = js.native
  def getTestDetails(testID: String): Unit = js.native
  def getTestDetails(testID: String, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
  def getTests(): Unit = js.native
  def getTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
  def getTests(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _], offset: Double): Unit = js.native
  def getTests(
    callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _],
    offset: Double,
    limit: Double
  ): Unit = js.native
  def getTunnel(): Unit = js.native
  def getTunnel(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
  def getUserInfo(): Unit = js.native
  def getUserInfo(callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
  def updateLabTest(data: TestLabData, testID: String): Unit = js.native
  def updateLabTest(
    data: TestLabData,
    testID: String,
    callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]
  ): Unit = js.native
  def updateTest(data: TestData, testID: String): Unit = js.native
  def updateTest(
    data: TestData,
    testID: String,
    callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]
  ): Unit = js.native
  def updateUserInfo(data: UserInfo): Unit = js.native
  def updateUserInfo(data: UserInfo, callback: js.Function2[/* error */ js.Any, /* responseBody */ js.Any, _]): Unit = js.native
}

