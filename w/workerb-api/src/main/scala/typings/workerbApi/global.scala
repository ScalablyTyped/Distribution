package typings.workerbApi

import typings.workerbApi.anon.Header
import typings.workerbApi.workerbApiStrings.error
import typings.workerbApi.workerbApiStrings.off
import typings.workerbApi.workerbApiStrings.on
import typings.workerbApi.workerbApiStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // global variables
  @JSGlobal("args")
  @js.native
  def args: js.Array[String] = js.native
  @scala.inline
  def args_=(x: js.Array[String]): Unit = js.Dynamic.global.updateDynamic("args")(x.asInstanceOf[js.Any])
  
  /**
    * The click function performs a mouse click on a target element. The element can be specified using different query methods.
    *
    * @param query A string used to identify the target element in the DOM.
    * @param options An optional object used to control what the click function does.
    *
    * @returns undefined
    */
  @JSGlobal("click")
  @js.native
  def click(query: String): js.UndefOr[scala.Nothing] = js.native
  @JSGlobal("click")
  @js.native
  def click(query: String, options: ClickQueryOptions): js.UndefOr[scala.Nothing] = js.native
  
  /**
    * The download can be used to download data as part of the script
    *
    * @param filename A string that specifies the name of the file.
    * @param content A string that specifies the contents of the file. For non-text formats, the content can be passed as base-64 encoded string.
    * @param contentType A string that specifies the contentType of the file.
    * It can be either 'text' for text files or any valid mime type e.g 'text/plain;charset=utf-8'
    *
    * @returns undefined
    */
  @JSGlobal("download")
  @js.native
  def download(filename: String, content: String, contentType: String): js.UndefOr[scala.Nothing] = js.native
  
  /**
    * The event function generates an event on a target element.
    *
    * @param query A string value used to identify the target element in the DOM.
    * @param eventConfig An object used to specify the event.
    * @param options An optional object used to control what the event function does.
    *
    * @returns undefined
    */
  @JSGlobal("event")
  @js.native
  def event(query: String, eventConfig: EventConfig): js.UndefOr[scala.Nothing] = js.native
  @JSGlobal("event")
  @js.native
  def event(query: String, eventConfig: EventConfig, options: ClickQueryOptions): js.UndefOr[scala.Nothing] = js.native
  
  /**
    * The getAttribute function can be used to get an attribute value of a target element.
    *
    * @param attributes  A string or an array of Strings used to specify the attribute(s) for which the value should be returned.
    * @param query A string value used to identify the target element in the DOM.
    * @param options An optional object used to control what the click function does.
    *
    * @returns An array of objects. Each object corresponds to each element in the DOM that satisfied the query and it has the attribute name & values as properties for that element.
    */
  @JSGlobal("getAttribute")
  @js.native
  def getAttribute(attributes: String, query: String): js.Array[js.Object] = js.native
  @JSGlobal("getAttribute")
  @js.native
  def getAttribute(attributes: String, query: String, options: GetAttributeQueryOptions): js.Array[js.Object] = js.native
  @JSGlobal("getAttribute")
  @js.native
  def getAttribute(attributes: js.Array[String], query: String): js.Array[js.Object] = js.native
  @JSGlobal("getAttribute")
  @js.native
  def getAttribute(attributes: js.Array[String], query: String, options: GetAttributeQueryOptions): js.Array[js.Object] = js.native
  
  /**
    * The httpDelete function can be used to make http delete requests.
    *
    * @param url A string used to specify the URL where delete request is made.
    * @param data A string used to specify the payload for the request.
    * @param headers An optional object used to specify the headers for the request.
    *
    * @returns An object
    *
    * * response: A string that has the response returned by the remote server.
    *
    * * status: A number that is the Status Code returned by the remote server.
    */
  @JSGlobal("httpDelete")
  @js.native
  def httpDelete(url: String): APIResponse = js.native
  @JSGlobal("httpDelete")
  @js.native
  def httpDelete(url: String, data: js.UndefOr[scala.Nothing], headers: js.Object): APIResponse = js.native
  @JSGlobal("httpDelete")
  @js.native
  def httpDelete(url: String, data: js.Any): APIResponse = js.native
  @JSGlobal("httpDelete")
  @js.native
  def httpDelete(url: String, data: js.Any, headers: js.Object): APIResponse = js.native
  
  /**
    * The httpGet function can be used to make http get requests.
    *
    * @param url A string used to specify the URL where delete request is made.
    * @param headers An optional object used to specify the headers for the request.
    *
    * @returns An object
    *
    * * response: A string that has the response returned by the remote server.
    *
    * * status: A number that is the Status Code returned by the remote server.
    */
  @JSGlobal("httpGet")
  @js.native
  def httpGet(url: String): APIResponse = js.native
  @JSGlobal("httpGet")
  @js.native
  def httpGet(url: String, headers: js.Object): APIResponse = js.native
  
  /**
    * The httpPost function can be used to make http post requests.
    *
    * @param url A string used to specify the URL where delete request is made.
    * @param data A string used to specify the payload for the request.
    * @param headers An optional object used to specify the headers for the request.
    *
    * @returns An object
    *
    * * response: A string that has the response returned by the remote server.
    *
    * * status: A number that is the Status Code returned by the remote server.
    */
  @JSGlobal("httpPost")
  @js.native
  def httpPost(url: String): APIResponse = js.native
  @JSGlobal("httpPost")
  @js.native
  def httpPost(url: String, data: js.UndefOr[scala.Nothing], headers: js.Object): APIResponse = js.native
  @JSGlobal("httpPost")
  @js.native
  def httpPost(url: String, data: js.Any): APIResponse = js.native
  @JSGlobal("httpPost")
  @js.native
  def httpPost(url: String, data: js.Any, headers: js.Object): APIResponse = js.native
  
  /**
    * The httpPut function can be used to make http put requests.
    *
    * @param url A string used to specify the URL where delete request is made.
    * @param data A string used to specify the payload for the request.
    * @param headers An optional object used to specify the headers for the request.
    *
    * @returns An object
    *
    * * response: A string that has the response returned by the remote server.
    *
    * * status: A number that is the Status Code returned by the remote server.
    */
  @JSGlobal("httpPut")
  @js.native
  def httpPut(url: String): APIResponse = js.native
  @JSGlobal("httpPut")
  @js.native
  def httpPut(url: String, data: js.UndefOr[scala.Nothing], headers: js.Object): APIResponse = js.native
  @JSGlobal("httpPut")
  @js.native
  def httpPut(url: String, data: js.Any): APIResponse = js.native
  @JSGlobal("httpPut")
  @js.native
  def httpPut(url: String, data: js.Any, headers: js.Object): APIResponse = js.native
  
  /**
    * The log function can be used to print messages to the browser console.
    *
    * @param value Any value needed to be logged.
    * @param color An optional string used to specify the color of the text.
    *
    * @returns undefined
    */
  @JSGlobal("log")
  @js.native
  def log(value: js.Any): js.UndefOr[scala.Nothing] = js.native
  @JSGlobal("log")
  @js.native
  def log(value: js.Any, color: String): js.UndefOr[scala.Nothing] = js.native
  
  @JSGlobal("logging")
  @js.native
  def logging_off(state: off): js.UndefOr[scala.Nothing] = js.native
  /**
    * The logging function is used to enable and disable debug messages logging.
    *
    * @param state A string with either 'on' or 'off' as a value to either enable or disable logging.
    *
    * @returns undefined
    */
  @JSGlobal("logging")
  @js.native
  def logging_on(state: on): js.UndefOr[scala.Nothing] = js.native
  
  /**
    * The notify function can be used to display a message to the user.
    *
    * @param message A string used to specify the text to be displayed.
    * @param type A string used to specify the type of the notification. Either error or success.
    * @param timeout A number used to specify the duration for which the notification will be displayed.
    *
    * @returns undefined
    */
  @JSGlobal("notify")
  @js.native
  def notify__error(message: String, `type`: error, timeout: Double): js.UndefOr[scala.Nothing] = js.native
  @JSGlobal("notify")
  @js.native
  def notify__success(message: String, `type`: success, timeout: Double): js.UndefOr[scala.Nothing] = js.native
  
  /**
    * The open function opens a link in the same browser window.
    *
    * @param url  A string that specifies the link to open
    *
    * @returns undefined
    */
  @JSGlobal("open")
  @js.native
  def open(url: String): js.UndefOr[scala.Nothing] = js.native
  
  @JSGlobal("options")
  @js.native
  def options: js.Any = js.native
  @scala.inline
  def options_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("options")(x.asInstanceOf[js.Any])
  
  /**
    * The prompt function opens a prompt to query user for input.
    *
    * @param label A string that specifies the message to show on the prompt
    *
    * @returns A string that has the user input.
    */
  @JSGlobal("prompt")
  @js.native
  def prompt(label: String): String = js.native
  
  /**
    * The read function returns a text from a target element.
    *
    * @param query A string used to identify the target element in the DOM.
    * @param options An optional object used to control what the read function does
    *
    * @returns A string which is either the text inside an element or in case of input the value of the input.
    */
  @JSGlobal("read")
  @js.native
  def read(query: String): String = js.native
  @JSGlobal("read")
  @js.native
  def read(query: String, options: ClickQueryOptions): String = js.native
  
  /**
    * The readAll function returns texts of all target elements which match the query.
    *
    * @param query  A string used to identify the target elements in the DOM. The query is run using a query selector. All elements satisfying the query are returned.
    * @param options  An optional object used to control what the read function does.
    *
    * @returns The array of values read.
    */
  @JSGlobal("readAll")
  @js.native
  def readAll(query: String): js.Array[_] = js.native
  @JSGlobal("readAll")
  @js.native
  def readAll(query: String, options: QueryOptions): js.Array[_] = js.native
  
  /**
    * The readTable function returns the content of a target table.
    *
    * @param query A string used to identify the target element in the DOM.
    * @param options An optional object used to control what the click function does.
    *
    * @returns An object
    *
    * * header: An array of strings which contains the heading for columns
    *
    * * rows: An array of objects where each key corresponds to a header from the 'header' array. If column header is not identified, the key will be 'column{index}'.
    */
  @JSGlobal("readTable")
  @js.native
  def readTable(query: String): Header = js.native
  @JSGlobal("readTable")
  @js.native
  def readTable(query: String, options: ClickQueryOptions): Header = js.native
  
  /**
    * The readURL function returns the URL of the webpage in the active tab.
    *
    * @returns A string which is the URL of the webpage in the active tab.
    */
  @JSGlobal("readUrl")
  @js.native
  def readUrl(): String = js.native
  
  /**
    * The runInTab function runs the specified function in a new tab and returns the result to the current tab.
    *
    * @param task A Function which specifies the code that should be run in the new tab.
    * @param keepOpen  A boolean Keep the tab open after executing the function.
    *
    * @returns A string which is stringified version of the value returned by the passed function.
    */
  @JSGlobal("runInTab")
  @js.native
  def runInTab(task: js.Function0[_], keepOpen: Boolean): String = js.native
  
  /**
    * Select value on a particular a DOM element.
    *
    * @param value The string value that you want to select.
    * @param query A string used to identify the target element in the DOM.
    * @param options An optional object used to control what the click function does
    *
    * @returns undefined
    */
  @JSGlobal("select")
  @js.native
  def select(value: String, query: String): js.UndefOr[scala.Nothing] = js.native
  @JSGlobal("select")
  @js.native
  def select(value: String, query: String, options: SelectQueryOptions): js.UndefOr[scala.Nothing] = js.native
  
  /**
    * The submit function generates an the 'enter' keypress event on a target form element. This can result in the submission of the parent form.
    *
    * @param query A string used to identify the target element in the DOM.
    * @param options An optional object used to control what the click function does
    *
    * @returns undefined
    */
  @JSGlobal("submit")
  @js.native
  def submit(query: String): js.UndefOr[scala.Nothing] = js.native
  @JSGlobal("submit")
  @js.native
  def submit(query: String, options: ClickQueryOptions): js.UndefOr[scala.Nothing] = js.native
  
  /**
    * The tab function opens a link in a new tab in the browser.
    *
    * @param url  A string that specifies the link to open
    *
    * @returns undefined
    */
  @JSGlobal("tab")
  @js.native
  def tab(url: String): js.UndefOr[scala.Nothing] = js.native
  
  /**
    * The type function writes a given string to a target input field. The input field can be specified using different query methods.
    *
    * @param text A string that should be written to a target input field.
    * @param query A string used to identify the target element in the DOM.
    * @param options An optional object used to control what the click function does.
    *
    * @returns undefined
    */
  @JSGlobal("type")
  @js.native
  def `type`(text: String, query: String): js.UndefOr[scala.Nothing] = js.native
  @JSGlobal("type")
  @js.native
  def `type`(text: String, query: String, options: TypeQueryInterface): js.UndefOr[scala.Nothing] = js.native
}
