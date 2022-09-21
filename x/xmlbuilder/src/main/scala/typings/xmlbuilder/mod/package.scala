package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Writable
import typings.xmlbuilder.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


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
inline def begin(): XMLDocumentCB = ^.asInstanceOf[js.Dynamic].applyDynamic("begin")().asInstanceOf[XMLDocumentCB]
inline def begin(options: Unit, onData: Unit, onEnd: OnEndCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]
inline def begin(options: Unit, onData: OnDataCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]
inline def begin(options: Unit, onData: OnDataCallback, onEnd: OnEndCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]
inline def begin(options: Unit, onData: OnEndCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]
inline def begin(options: Unit, onData: OnEndCallback, onEnd: OnEndCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]
inline def begin(options: BeginOptions): XMLDocumentCB = ^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any]).asInstanceOf[XMLDocumentCB]
inline def begin(options: BeginOptions, onData: Unit, onEnd: OnEndCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]
inline def begin(options: BeginOptions, onData: OnDataCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]
inline def begin(options: BeginOptions, onData: OnDataCallback, onEnd: OnEndCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]
inline def begin(options: BeginOptions, onData: OnEndCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]
inline def begin(options: BeginOptions, onData: OnEndCallback, onEnd: OnEndCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]
inline def begin(options: OnDataCallback): XMLDocumentCB = ^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any]).asInstanceOf[XMLDocumentCB]
inline def begin(options: OnDataCallback, onData: Unit, onEnd: OnEndCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]
inline def begin(options: OnDataCallback, onData: OnDataCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]
inline def begin(options: OnDataCallback, onData: OnDataCallback, onEnd: OnEndCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]
inline def begin(options: OnDataCallback, onData: OnEndCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]
inline def begin(options: OnDataCallback, onData: OnEndCallback, onEnd: OnEndCallback): XMLDocumentCB = (^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[XMLDocumentCB]

/**
  * Creates a new XML document and returns the document node.
  * This function creates an empty document without the XML prolog or
  * a root element.
  * 
  * @param options - create options
  */
inline def begin_XMLDocument(): XMLDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("begin")().asInstanceOf[XMLDocument]
inline def begin_XMLDocument(options: BeginOptions): XMLDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any]).asInstanceOf[XMLDocument]

/**
  * Creates a new XML document and returns the root element node.
  * 
  * @param nameOrObject - name of the root element or a JS object to be 
  * converted to an XML tree
  * @param xmldecOrOptions - XML declaration or create options
  * @param doctypeOrOptions - Doctype declaration or create options
  * @param options - create options
  */
inline def create(nameOrObject: String): XMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any]).asInstanceOf[XMLElement]
inline def create(nameOrObject: String, xmldecOrOptions: Unit, doctypeOrOptions: Unit, options: CreateOptions): XMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[XMLElement]
inline def create(nameOrObject: String, xmldecOrOptions: Unit, doctypeOrOptions: CreateOptions): XMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any])).asInstanceOf[XMLElement]
inline def create(
  nameOrObject: String,
  xmldecOrOptions: Unit,
  doctypeOrOptions: CreateOptions,
  options: CreateOptions
): XMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[XMLElement]
inline def create(nameOrObject: String, xmldecOrOptions: CreateOptions): XMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any])).asInstanceOf[XMLElement]
inline def create(
  nameOrObject: String,
  xmldecOrOptions: CreateOptions,
  doctypeOrOptions: Unit,
  options: CreateOptions
): XMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[XMLElement]
inline def create(nameOrObject: String, xmldecOrOptions: CreateOptions, doctypeOrOptions: CreateOptions): XMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any])).asInstanceOf[XMLElement]
inline def create(
  nameOrObject: String,
  xmldecOrOptions: CreateOptions,
  doctypeOrOptions: CreateOptions,
  options: CreateOptions
): XMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[XMLElement]
inline def create(nameOrObject: StringDictionary[js.Object]): XMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any]).asInstanceOf[XMLElement]
inline def create(
  nameOrObject: StringDictionary[js.Object],
  xmldecOrOptions: Unit,
  doctypeOrOptions: Unit,
  options: CreateOptions
): XMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[XMLElement]
inline def create(nameOrObject: StringDictionary[js.Object], xmldecOrOptions: Unit, doctypeOrOptions: CreateOptions): XMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any])).asInstanceOf[XMLElement]
inline def create(
  nameOrObject: StringDictionary[js.Object],
  xmldecOrOptions: Unit,
  doctypeOrOptions: CreateOptions,
  options: CreateOptions
): XMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[XMLElement]
inline def create(nameOrObject: StringDictionary[js.Object], xmldecOrOptions: CreateOptions): XMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any])).asInstanceOf[XMLElement]
inline def create(
  nameOrObject: StringDictionary[js.Object],
  xmldecOrOptions: CreateOptions,
  doctypeOrOptions: Unit,
  options: CreateOptions
): XMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[XMLElement]
inline def create(
  nameOrObject: StringDictionary[js.Object],
  xmldecOrOptions: CreateOptions,
  doctypeOrOptions: CreateOptions
): XMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any])).asInstanceOf[XMLElement]
inline def create(
  nameOrObject: StringDictionary[js.Object],
  xmldecOrOptions: CreateOptions,
  doctypeOrOptions: CreateOptions,
  options: CreateOptions
): XMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[XMLElement]

/**
  * Creates and returns a default stream writer.
  * 
  * @param stream - a writeable stream
  * @param options - writer options
  */
inline def streamWriter(stream: Writable): XMLWriter = ^.asInstanceOf[js.Dynamic].applyDynamic("streamWriter")(stream.asInstanceOf[js.Any]).asInstanceOf[XMLWriter]
inline def streamWriter(stream: Writable, options: WriterOptions): XMLWriter = (^.asInstanceOf[js.Dynamic].applyDynamic("streamWriter")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[XMLWriter]

/**
  * Creates and returns a default string writer.
  * 
  * @param options - writer options
  */
inline def stringWriter(): XMLWriter = ^.asInstanceOf[js.Dynamic].applyDynamic("stringWriter")().asInstanceOf[XMLWriter]
inline def stringWriter(options: WriterOptions): XMLWriter = ^.asInstanceOf[js.Dynamic].applyDynamic("stringWriter")(options.asInstanceOf[js.Any]).asInstanceOf[XMLWriter]

/**
  * A function to be called when a chunk of XML is written.
  * 
  * @param chunk - a chunk of string that was written
  * @param level - current depth of the XML tree
  */
type OnDataCallback = js.Function2[/* chunk */ String, /* level */ Double, Unit]

/**
  * A function to be called when the XML doucment is completed.
  */
type OnEndCallback = js.Function0[Unit]
