package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlbuilder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Creates a new XML document and returns the document node.
    * This function creates an empty document without the XML prolog or
    * a root element.
    * 
    * @param options - create options
    */
  def begin(): XMLDocument = js.native
  def begin(options: BeginOptions): XMLDocument = js.native
  def begin(options: BeginOptions, onData: OnDataCallback): XMLDocumentCB = js.native
  def begin(options: BeginOptions, onData: OnDataCallback, onEnd: OnEndCallback): XMLDocumentCB = js.native
  def begin(options: BeginOptions, onData: OnEndCallback): XMLDocumentCB = js.native
  def begin(options: BeginOptions, onData: OnEndCallback, onEnd: OnEndCallback): XMLDocumentCB = js.native
  def begin(options: OnDataCallback): XMLDocumentCB = js.native
  def begin(options: OnDataCallback, onData: OnDataCallback): XMLDocumentCB = js.native
  def begin(options: OnDataCallback, onData: OnDataCallback, onEnd: OnEndCallback): XMLDocumentCB = js.native
  def begin(options: OnDataCallback, onData: OnEndCallback): XMLDocumentCB = js.native
  def begin(options: OnDataCallback, onData: OnEndCallback, onEnd: OnEndCallback): XMLDocumentCB = js.native
  /**
    * Creates a new XML document in callback mode and returns the document
    * node.
    * 
    * @param options - create options
    * @param onData - the function to be called when a new chunk of XML is
    * output. The string containing the XML chunk is passed to `onData` as
    * its first argument and the current depth of the tree is passed as its
    * second argument.
    * @param onEnd - the function to be called when the XML document is 
    * completed with `end`. `onEnd` does not receive any arguments.
    */
  @JSName("begin")
  def begin_XMLDocumentCB(): XMLDocumentCB = js.native
  @JSName("begin")
  def begin_XMLDocumentCB(options: BeginOptions): XMLDocumentCB = js.native
  /**
    * Creates a new XML document and returns the root element node.
    * 
    * @param nameOrObject - name of the root element or a JS object to be 
    * converted to an XML tree
    * @param xmldecOrOptions - XML declaration or create options
    * @param doctypeOrOptions - Doctype declaration or create options
    * @param options - create options
    */
  def create(nameOrObject: java.lang.String): XMLElement = js.native
  def create(nameOrObject: java.lang.String, xmldecOrOptions: CreateOptions): XMLElement = js.native
  def create(nameOrObject: java.lang.String, xmldecOrOptions: CreateOptions, doctypeOrOptions: CreateOptions): XMLElement = js.native
  def create(
    nameOrObject: java.lang.String,
    xmldecOrOptions: CreateOptions,
    doctypeOrOptions: CreateOptions,
    options: CreateOptions
  ): XMLElement = js.native
  def create(nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object]): XMLElement = js.native
  def create(
    nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
    xmldecOrOptions: CreateOptions
  ): XMLElement = js.native
  def create(
    nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
    xmldecOrOptions: CreateOptions,
    doctypeOrOptions: CreateOptions
  ): XMLElement = js.native
  def create(
    nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
    xmldecOrOptions: CreateOptions,
    doctypeOrOptions: CreateOptions,
    options: CreateOptions
  ): XMLElement = js.native
  /**
    * Creates and returns a default stream writer.
    * 
    * @param stream - a writeable stream
    * @param options - writer options
    */
  def streamWriter(stream: nodeLib.streamMod.Writable): XMLWriter = js.native
  def streamWriter(stream: nodeLib.streamMod.Writable, options: WriterOptions): XMLWriter = js.native
  /**
    * Creates and returns a default string writer.
    * 
    * @param options - writer options
    */
  def stringWriter(): XMLWriter = js.native
  def stringWriter(options: WriterOptions): XMLWriter = js.native
}

