package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebPageTest extends StObject {
  
  def cancelTest(id: String, callback: Callback[_]): Unit = js.native
  def cancelTest(id: String, options: Options with KeyOptions, callback: Callback[_]): Unit = js.native
  
  def createVideo(tests: String, callback: Callback[_]): Unit = js.native
  def createVideo(tests: String, options: Options with VideoOptions, callback: Callback[_]): Unit = js.native
  
  def getChromeTraceData(id: String, callback: Callback[_]): Unit = js.native
  def getChromeTraceData(id: String, options: Options with RunOptions, callback: Callback[_]): Unit = js.native
  
  def getConsoleLogData(id: String, callback: Callback[_]): Unit = js.native
  def getConsoleLogData(id: String, options: Options with RunOptions, callback: Callback[_]): Unit = js.native
  
  def getEmbedVideoPlayer(id: String, callback: Callback[_]): Unit = js.native
  def getEmbedVideoPlayer(id: String, options: Options, callback: Callback[_]): Unit = js.native
  
  def getGoogleCsiData(id: String, callback: Callback[_]): Unit = js.native
  def getGoogleCsiData(id: String, options: Options with RunOptions, callback: Callback[_]): Unit = js.native
  
  def getHARData(id: String, callback: Callback[_]): Unit = js.native
  def getHARData(id: String, options: Options, callback: Callback[_]): Unit = js.native
  
  def getHistory(days: Double, callback: Callback[_]): Unit = js.native
  def getHistory(days: Double, options: Options, callback: Callback[_]): Unit = js.native
  
  def getLocations(callback: Callback[typings.webpagetest.anon.Response]): Unit = js.native
  def getLocations(options: Options with RequestOptions, callback: Callback[typings.webpagetest.anon.Response]): Unit = js.native
  
  def getNetLogData(id: String, callback: Callback[_]): Unit = js.native
  def getNetLogData(id: String, options: Options with RunOptions, callback: Callback[_]): Unit = js.native
  
  def getPageSpeedData(id: String, callback: Callback[_]): Unit = js.native
  def getPageSpeedData(id: String, options: Options with RunOptions, callback: Callback[_]): Unit = js.native
  
  def getRequestData(id: String, callback: Callback[_]): Unit = js.native
  def getRequestData(id: String, options: Options with RunOptions, callback: Callback[_]): Unit = js.native
  
  def getResponseBody(id: String, callback: Callback[_]): Unit = js.native
  def getResponseBody(id: String, options: Options with RunOptions with ResponseOptions, callback: Callback[_]): Unit = js.native
  
  def getScreenshotImage(id: String, callback: Callback[_]): Unit = js.native
  def getScreenshotImage(
    id: String,
    options: Options with RunOptions with ImageOptions with ScreenshotOptions,
    callback: Callback[_]
  ): Unit = js.native
  
  def getTestInfo(id: String, callback: Callback[_]): Unit = js.native
  def getTestInfo(id: String, options: Options, callback: Callback[_]): Unit = js.native
  
  def getTestResults(id: String, callback: Callback[Response[TestResult]]): Unit = js.native
  def getTestResults(
    id: String,
    options: Options with RequestOptions with ResultsOptions,
    callback: Callback[Response[TestResult]]
  ): Unit = js.native
  
  def getTestStatus(id: String, callback: Callback[Response[TestStatus]]): Unit = js.native
  def getTestStatus(id: String, options: Options with RequestOptions, callback: Callback[Response[TestStatus]]): Unit = js.native
  
  def getTesters(callback: Callback[_]): Unit = js.native
  def getTesters(options: Options with RequestOptions, callback: Callback[_]): Unit = js.native
  
  def getTimelineData(id: String, callback: Callback[_]): Unit = js.native
  def getTimelineData(id: String, options: Options with RunOptions, callback: Callback[_]): Unit = js.native
  
  def getUtilizationData(id: String, callback: Callback[_]): Unit = js.native
  def getUtilizationData(id: String, options: Options with RunOptions, callback: Callback[_]): Unit = js.native
  
  def getWaterfallImage(id: String, callback: Callback[_]): Unit = js.native
  def getWaterfallImage(
    id: String,
    options: Options with RunOptions with ImageOptions with WaterfallOptions,
    callback: Callback[_]
  ): Unit = js.native
  
  def listen(port: Double, callback: Callback[_]): Unit = js.native
  def listen(port: Double, options: Options with ListenOptions, callback: Callback[_]): Unit = js.native
  
  def runTest(url_or_script: String, callback: Callback[_]): Unit = js.native
  def runTest(
    url_or_script: String,
    options: Options with TestOptions with KeyOptions with ResultsOptions,
    callback: Callback[_]
  ): Unit = js.native
  
  def scriptToString(script: TestScript): String = js.native
}
