package typings.workerbApi

import typings.workerbApi.anon.Header
import typings.workerbApi.workerbApiStrings.error
import typings.workerbApi.workerbApiStrings.off
import typings.workerbApi.workerbApiStrings.on
import typings.workerbApi.workerbApiStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def click(query: String): Unit = js.Dynamic.global.applyDynamic("click")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def click(query: String, options: ClickQueryOptions): Unit = (js.Dynamic.global.applyDynamic("click")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  @scala.inline
  def download(filename: String, content: String, contentType: String): Unit = (js.Dynamic.global.applyDynamic("download")(filename.asInstanceOf[js.Any], content.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * The event function generates an event on a target element.
    *
    * @param query A string value used to identify the target element in the DOM.
    * @param eventConfig An object used to specify the event.
    * @param options An optional object used to control what the event function does.
    *
    * @returns undefined
    */
  @scala.inline
  def event(query: String, eventConfig: EventConfig): Unit = (js.Dynamic.global.applyDynamic("event")(query.asInstanceOf[js.Any], eventConfig.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def event(query: String, eventConfig: EventConfig, options: ClickQueryOptions): Unit = (js.Dynamic.global.applyDynamic("event")(query.asInstanceOf[js.Any], eventConfig.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * The getAttribute function can be used to get an attribute value of a target element.
    *
    * @param attributes  A string or an array of Strings used to specify the attribute(s) for which the value should be returned.
    * @param query A string value used to identify the target element in the DOM.
    * @param options An optional object used to control what the click function does.
    *
    * @returns An array of objects. Each object corresponds to each element in the DOM that satisfied the query and it has the attribute name & values as properties for that element.
    */
  @scala.inline
  def getAttribute(attributes: String, query: String): js.Array[js.Object] = (js.Dynamic.global.applyDynamic("getAttribute")(attributes.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  @scala.inline
  def getAttribute(attributes: String, query: String, options: GetAttributeQueryOptions): js.Array[js.Object] = (js.Dynamic.global.applyDynamic("getAttribute")(attributes.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  @scala.inline
  def getAttribute(attributes: js.Array[String], query: String): js.Array[js.Object] = (js.Dynamic.global.applyDynamic("getAttribute")(attributes.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  @scala.inline
  def getAttribute(attributes: js.Array[String], query: String, options: GetAttributeQueryOptions): js.Array[js.Object] = (js.Dynamic.global.applyDynamic("getAttribute")(attributes.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
  
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
  @scala.inline
  def httpDelete(url: String): APIResponse = js.Dynamic.global.applyDynamic("httpDelete")(url.asInstanceOf[js.Any]).asInstanceOf[APIResponse]
  @scala.inline
  def httpDelete(url: String, data: js.Any): APIResponse = (js.Dynamic.global.applyDynamic("httpDelete")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[APIResponse]
  @scala.inline
  def httpDelete(url: String, data: js.Any, headers: js.Object): APIResponse = (js.Dynamic.global.applyDynamic("httpDelete")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[APIResponse]
  @scala.inline
  def httpDelete(url: String, data: Unit, headers: js.Object): APIResponse = (js.Dynamic.global.applyDynamic("httpDelete")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[APIResponse]
  
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
  @scala.inline
  def httpGet(url: String): APIResponse = js.Dynamic.global.applyDynamic("httpGet")(url.asInstanceOf[js.Any]).asInstanceOf[APIResponse]
  @scala.inline
  def httpGet(url: String, headers: js.Object): APIResponse = (js.Dynamic.global.applyDynamic("httpGet")(url.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[APIResponse]
  
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
  @scala.inline
  def httpPost(url: String): APIResponse = js.Dynamic.global.applyDynamic("httpPost")(url.asInstanceOf[js.Any]).asInstanceOf[APIResponse]
  @scala.inline
  def httpPost(url: String, data: js.Any): APIResponse = (js.Dynamic.global.applyDynamic("httpPost")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[APIResponse]
  @scala.inline
  def httpPost(url: String, data: js.Any, headers: js.Object): APIResponse = (js.Dynamic.global.applyDynamic("httpPost")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[APIResponse]
  @scala.inline
  def httpPost(url: String, data: Unit, headers: js.Object): APIResponse = (js.Dynamic.global.applyDynamic("httpPost")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[APIResponse]
  
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
  @scala.inline
  def httpPut(url: String): APIResponse = js.Dynamic.global.applyDynamic("httpPut")(url.asInstanceOf[js.Any]).asInstanceOf[APIResponse]
  @scala.inline
  def httpPut(url: String, data: js.Any): APIResponse = (js.Dynamic.global.applyDynamic("httpPut")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[APIResponse]
  @scala.inline
  def httpPut(url: String, data: js.Any, headers: js.Object): APIResponse = (js.Dynamic.global.applyDynamic("httpPut")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[APIResponse]
  @scala.inline
  def httpPut(url: String, data: Unit, headers: js.Object): APIResponse = (js.Dynamic.global.applyDynamic("httpPut")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[APIResponse]
  
  /**
    * The log function can be used to print messages to the browser console.
    *
    * @param value Any value needed to be logged.
    * @param color An optional string used to specify the color of the text.
    *
    * @returns undefined
    */
  @scala.inline
  def log(value: js.Any): Unit = js.Dynamic.global.applyDynamic("log")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def log(value: js.Any, color: String): Unit = (js.Dynamic.global.applyDynamic("log")(value.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def logging_off(state: off): Unit = js.Dynamic.global.applyDynamic("logging")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * The logging function is used to enable and disable debug messages logging.
    *
    * @param state A string with either 'on' or 'off' as a value to either enable or disable logging.
    *
    * @returns undefined
    */
  @scala.inline
  def logging_on(state: on): Unit = js.Dynamic.global.applyDynamic("logging")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * The notify function can be used to display a message to the user.
    *
    * @param message A string used to specify the text to be displayed.
    * @param type A string used to specify the type of the notification. Either error or success.
    * @param timeout A number used to specify the duration for which the notification will be displayed.
    *
    * @returns undefined
    */
  @scala.inline
  def notify__error(message: String, `type`: error, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("notify")(message.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def notify__success(message: String, `type`: success, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("notify")(message.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * The open function opens a link in the same browser window.
    *
    * @param url  A string that specifies the link to open
    *
    * @returns undefined
    */
  @scala.inline
  def open(url: String): Unit = js.Dynamic.global.applyDynamic("open")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  @scala.inline
  def prompt(label: String): String = js.Dynamic.global.applyDynamic("prompt")(label.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * The read function returns a text from a target element.
    *
    * @param query A string used to identify the target element in the DOM.
    * @param options An optional object used to control what the read function does
    *
    * @returns A string which is either the text inside an element or in case of input the value of the input.
    */
  @scala.inline
  def read(query: String): String = js.Dynamic.global.applyDynamic("read")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def read(query: String, options: ClickQueryOptions): String = (js.Dynamic.global.applyDynamic("read")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * The readAll function returns texts of all target elements which match the query.
    *
    * @param query  A string used to identify the target elements in the DOM. The query is run using a query selector. All elements satisfying the query are returned.
    * @param options  An optional object used to control what the read function does.
    *
    * @returns The array of values read.
    */
  @scala.inline
  def readAll(query: String): js.Array[js.Any] = js.Dynamic.global.applyDynamic("readAll")(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  @scala.inline
  def readAll(query: String, options: QueryOptions): js.Array[js.Any] = (js.Dynamic.global.applyDynamic("readAll")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
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
  @scala.inline
  def readTable(query: String): Header = js.Dynamic.global.applyDynamic("readTable")(query.asInstanceOf[js.Any]).asInstanceOf[Header]
  @scala.inline
  def readTable(query: String, options: ClickQueryOptions): Header = (js.Dynamic.global.applyDynamic("readTable")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Header]
  
  /**
    * The readURL function returns the URL of the webpage in the active tab.
    *
    * @returns A string which is the URL of the webpage in the active tab.
    */
  @scala.inline
  def readUrl(): String = js.Dynamic.global.applyDynamic("readUrl")().asInstanceOf[String]
  
  /**
    * The runInTab function runs the specified function in a new tab and returns the result to the current tab.
    *
    * @param task A Function which specifies the code that should be run in the new tab.
    * @param keepOpen  A boolean Keep the tab open after executing the function.
    *
    * @returns A string which is stringified version of the value returned by the passed function.
    */
  @scala.inline
  def runInTab(task: js.Function0[js.Any], keepOpen: Boolean): String = (js.Dynamic.global.applyDynamic("runInTab")(task.asInstanceOf[js.Any], keepOpen.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Select value on a particular a DOM element.
    *
    * @param value The string value that you want to select.
    * @param query A string used to identify the target element in the DOM.
    * @param options An optional object used to control what the click function does
    *
    * @returns undefined
    */
  @scala.inline
  def select(value: String, query: String): Unit = (js.Dynamic.global.applyDynamic("select")(value.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def select(value: String, query: String, options: SelectQueryOptions): Unit = (js.Dynamic.global.applyDynamic("select")(value.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * The submit function generates an the 'enter' keypress event on a target form element. This can result in the submission of the parent form.
    *
    * @param query A string used to identify the target element in the DOM.
    * @param options An optional object used to control what the click function does
    *
    * @returns undefined
    */
  @scala.inline
  def submit(query: String): Unit = js.Dynamic.global.applyDynamic("submit")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def submit(query: String, options: ClickQueryOptions): Unit = (js.Dynamic.global.applyDynamic("submit")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * The tab function opens a link in a new tab in the browser.
    *
    * @param url  A string that specifies the link to open
    *
    * @returns undefined
    */
  @scala.inline
  def tab(url: String): Unit = js.Dynamic.global.applyDynamic("tab")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * The type function writes a given string to a target input field. The input field can be specified using different query methods.
    *
    * @param text A string that should be written to a target input field.
    * @param query A string used to identify the target element in the DOM.
    * @param options An optional object used to control what the click function does.
    *
    * @returns undefined
    */
  @scala.inline
  def `type`(text: String, query: String): Unit = (js.Dynamic.global.applyDynamic("type")(text.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def `type`(text: String, query: String, options: TypeQueryInterface): Unit = (js.Dynamic.global.applyDynamic("type")(text.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
