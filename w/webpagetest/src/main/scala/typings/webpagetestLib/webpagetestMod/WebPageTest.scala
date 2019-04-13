package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPageTest extends js.Object {
  def cancelTest(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def cancelTest(id: java.lang.String, options: Options with KeyOptions, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def createVideo(tests: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def createVideo(tests: java.lang.String, options: Options with VideoOptions, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getChromeTraceData(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getChromeTraceData(id: java.lang.String, options: Options with RunOptions, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getConsoleLogData(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getConsoleLogData(id: java.lang.String, options: Options with RunOptions, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getEmbedVideoPlayer(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getEmbedVideoPlayer(id: java.lang.String, options: Options, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getGoogleCsiData(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getGoogleCsiData(id: java.lang.String, options: Options with RunOptions, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getHARData(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getHARData(id: java.lang.String, options: Options, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getHistory(days: scala.Double, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getHistory(days: scala.Double, options: Options, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getLocations(callback: webpagetestLib.Callback[webpagetestLib.Anon_Response]): scala.Unit = js.native
  def getLocations(
    options: Options with RequestOptions,
    callback: webpagetestLib.Callback[webpagetestLib.Anon_Response]
  ): scala.Unit = js.native
  def getNetLogData(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getNetLogData(id: java.lang.String, options: Options with RunOptions, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getPageSpeedData(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getPageSpeedData(id: java.lang.String, options: Options with RunOptions, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getRequestData(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getRequestData(id: java.lang.String, options: Options with RunOptions, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getResponseBody(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getResponseBody(
    id: java.lang.String,
    options: Options with RunOptions with ResponseOptions,
    callback: webpagetestLib.Callback[_]
  ): scala.Unit = js.native
  def getScreenshotImage(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getScreenshotImage(
    id: java.lang.String,
    options: Options with RunOptions with ImageOptions with ScreenshotOptions,
    callback: webpagetestLib.Callback[_]
  ): scala.Unit = js.native
  def getTestInfo(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getTestInfo(id: java.lang.String, options: Options, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getTestResults(id: java.lang.String, callback: webpagetestLib.Callback[Response[TestResult]]): scala.Unit = js.native
  def getTestResults(
    id: java.lang.String,
    options: Options with RequestOptions with ResultsOptions,
    callback: webpagetestLib.Callback[Response[TestResult]]
  ): scala.Unit = js.native
  def getTestStatus(id: java.lang.String, callback: webpagetestLib.Callback[Response[TestStatus]]): scala.Unit = js.native
  def getTestStatus(
    id: java.lang.String,
    options: Options with RequestOptions,
    callback: webpagetestLib.Callback[Response[TestStatus]]
  ): scala.Unit = js.native
  def getTesters(callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getTesters(options: Options with RequestOptions, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getTimelineData(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getTimelineData(id: java.lang.String, options: Options with RunOptions, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getUtilizationData(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getUtilizationData(id: java.lang.String, options: Options with RunOptions, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getWaterfallImage(id: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def getWaterfallImage(
    id: java.lang.String,
    options: Options with RunOptions with ImageOptions with WaterfallOptions,
    callback: webpagetestLib.Callback[_]
  ): scala.Unit = js.native
  def listen(port: scala.Double, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def listen(port: scala.Double, options: Options with ListenOptions, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def runTest(url_or_script: java.lang.String, callback: webpagetestLib.Callback[_]): scala.Unit = js.native
  def runTest(
    url_or_script: java.lang.String,
    options: Options with TestOptions with KeyOptions with ResultsOptions,
    callback: webpagetestLib.Callback[_]
  ): scala.Unit = js.native
  def scriptToString(script: webpagetestLib.TestScript): java.lang.String = js.native
}

