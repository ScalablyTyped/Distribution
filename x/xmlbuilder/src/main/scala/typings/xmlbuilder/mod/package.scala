package typings.xmlbuilder.mod

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
@scala.inline
def begin(): typings.xmlbuilder.mod.XMLDocumentCB = typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")().asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(options: scala.Unit, onData: scala.Unit, onEnd: typings.xmlbuilder.mod.OnEndCallback): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(options: scala.Unit, onData: typings.xmlbuilder.mod.OnDataCallback): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(
  options: scala.Unit,
  onData: typings.xmlbuilder.mod.OnDataCallback,
  onEnd: typings.xmlbuilder.mod.OnEndCallback
): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(options: scala.Unit, onData: typings.xmlbuilder.mod.OnEndCallback): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(
  options: scala.Unit,
  onData: typings.xmlbuilder.mod.OnEndCallback,
  onEnd: typings.xmlbuilder.mod.OnEndCallback
): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(options: typings.xmlbuilder.mod.BeginOptions): typings.xmlbuilder.mod.XMLDocumentCB = typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any]).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(
  options: typings.xmlbuilder.mod.BeginOptions,
  onData: scala.Unit,
  onEnd: typings.xmlbuilder.mod.OnEndCallback
): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(options: typings.xmlbuilder.mod.BeginOptions, onData: typings.xmlbuilder.mod.OnDataCallback): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(
  options: typings.xmlbuilder.mod.BeginOptions,
  onData: typings.xmlbuilder.mod.OnDataCallback,
  onEnd: typings.xmlbuilder.mod.OnEndCallback
): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(options: typings.xmlbuilder.mod.BeginOptions, onData: typings.xmlbuilder.mod.OnEndCallback): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(
  options: typings.xmlbuilder.mod.BeginOptions,
  onData: typings.xmlbuilder.mod.OnEndCallback,
  onEnd: typings.xmlbuilder.mod.OnEndCallback
): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(options: typings.xmlbuilder.mod.OnDataCallback): typings.xmlbuilder.mod.XMLDocumentCB = typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any]).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(
  options: typings.xmlbuilder.mod.OnDataCallback,
  onData: scala.Unit,
  onEnd: typings.xmlbuilder.mod.OnEndCallback
): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(options: typings.xmlbuilder.mod.OnDataCallback, onData: typings.xmlbuilder.mod.OnDataCallback): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(
  options: typings.xmlbuilder.mod.OnDataCallback,
  onData: typings.xmlbuilder.mod.OnDataCallback,
  onEnd: typings.xmlbuilder.mod.OnEndCallback
): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(options: typings.xmlbuilder.mod.OnDataCallback, onData: typings.xmlbuilder.mod.OnEndCallback): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]
@scala.inline
def begin(
  options: typings.xmlbuilder.mod.OnDataCallback,
  onData: typings.xmlbuilder.mod.OnEndCallback,
  onEnd: typings.xmlbuilder.mod.OnEndCallback
): typings.xmlbuilder.mod.XMLDocumentCB = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any], onData.asInstanceOf[js.Any], onEnd.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLDocumentCB]

/**
  * Creates a new XML document and returns the document node.
  * This function creates an empty document without the XML prolog or
  * a root element.
  * 
  * @param options - create options
  */
@scala.inline
def begin_XMLDocument(): typings.xmlbuilder.mod.XMLDocument = typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")().asInstanceOf[typings.xmlbuilder.mod.XMLDocument]
@scala.inline
def begin_XMLDocument(options: typings.xmlbuilder.mod.BeginOptions): typings.xmlbuilder.mod.XMLDocument = typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("begin")(options.asInstanceOf[js.Any]).asInstanceOf[typings.xmlbuilder.mod.XMLDocument]

/**
  * Creates a new XML document and returns the root element node.
  * 
  * @param nameOrObject - name of the root element or a JS object to be 
  * converted to an XML tree
  * @param xmldecOrOptions - XML declaration or create options
  * @param doctypeOrOptions - Doctype declaration or create options
  * @param options - create options
  */
@scala.inline
def create(nameOrObject: java.lang.String): typings.xmlbuilder.mod.XMLElement = typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any]).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(
  nameOrObject: java.lang.String,
  xmldecOrOptions: scala.Unit,
  doctypeOrOptions: scala.Unit,
  options: typings.xmlbuilder.mod.CreateOptions
): typings.xmlbuilder.mod.XMLElement = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(
  nameOrObject: java.lang.String,
  xmldecOrOptions: scala.Unit,
  doctypeOrOptions: typings.xmlbuilder.mod.CreateOptions
): typings.xmlbuilder.mod.XMLElement = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(
  nameOrObject: java.lang.String,
  xmldecOrOptions: scala.Unit,
  doctypeOrOptions: typings.xmlbuilder.mod.CreateOptions,
  options: typings.xmlbuilder.mod.CreateOptions
): typings.xmlbuilder.mod.XMLElement = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(nameOrObject: java.lang.String, xmldecOrOptions: typings.xmlbuilder.mod.CreateOptions): typings.xmlbuilder.mod.XMLElement = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(
  nameOrObject: java.lang.String,
  xmldecOrOptions: typings.xmlbuilder.mod.CreateOptions,
  doctypeOrOptions: scala.Unit,
  options: typings.xmlbuilder.mod.CreateOptions
): typings.xmlbuilder.mod.XMLElement = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(
  nameOrObject: java.lang.String,
  xmldecOrOptions: typings.xmlbuilder.mod.CreateOptions,
  doctypeOrOptions: typings.xmlbuilder.mod.CreateOptions
): typings.xmlbuilder.mod.XMLElement = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(
  nameOrObject: java.lang.String,
  xmldecOrOptions: typings.xmlbuilder.mod.CreateOptions,
  doctypeOrOptions: typings.xmlbuilder.mod.CreateOptions,
  options: typings.xmlbuilder.mod.CreateOptions
): typings.xmlbuilder.mod.XMLElement = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object]): typings.xmlbuilder.mod.XMLElement = typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any]).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(
  nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
  xmldecOrOptions: scala.Unit,
  doctypeOrOptions: scala.Unit,
  options: typings.xmlbuilder.mod.CreateOptions
): typings.xmlbuilder.mod.XMLElement = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(
  nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
  xmldecOrOptions: scala.Unit,
  doctypeOrOptions: typings.xmlbuilder.mod.CreateOptions
): typings.xmlbuilder.mod.XMLElement = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(
  nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
  xmldecOrOptions: scala.Unit,
  doctypeOrOptions: typings.xmlbuilder.mod.CreateOptions,
  options: typings.xmlbuilder.mod.CreateOptions
): typings.xmlbuilder.mod.XMLElement = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(
  nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
  xmldecOrOptions: typings.xmlbuilder.mod.CreateOptions
): typings.xmlbuilder.mod.XMLElement = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(
  nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
  xmldecOrOptions: typings.xmlbuilder.mod.CreateOptions,
  doctypeOrOptions: scala.Unit,
  options: typings.xmlbuilder.mod.CreateOptions
): typings.xmlbuilder.mod.XMLElement = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(
  nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
  xmldecOrOptions: typings.xmlbuilder.mod.CreateOptions,
  doctypeOrOptions: typings.xmlbuilder.mod.CreateOptions
): typings.xmlbuilder.mod.XMLElement = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLElement]
@scala.inline
def create(
  nameOrObject: org.scalablytyped.runtime.StringDictionary[js.Object],
  xmldecOrOptions: typings.xmlbuilder.mod.CreateOptions,
  doctypeOrOptions: typings.xmlbuilder.mod.CreateOptions,
  options: typings.xmlbuilder.mod.CreateOptions
): typings.xmlbuilder.mod.XMLElement = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("create")(nameOrObject.asInstanceOf[js.Any], xmldecOrOptions.asInstanceOf[js.Any], doctypeOrOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLElement]

/**
  * Creates and returns a default stream writer.
  * 
  * @param stream - a writeable stream
  * @param options - writer options
  */
@scala.inline
def streamWriter(stream: typings.node.streamMod.Writable): typings.xmlbuilder.mod.XMLWriter = typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("streamWriter")(stream.asInstanceOf[js.Any]).asInstanceOf[typings.xmlbuilder.mod.XMLWriter]
@scala.inline
def streamWriter(stream: typings.node.streamMod.Writable, options: typings.xmlbuilder.mod.WriterOptions): typings.xmlbuilder.mod.XMLWriter = (typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("streamWriter")(stream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.xmlbuilder.mod.XMLWriter]

/**
  * Creates and returns a default string writer.
  * 
  * @param options - writer options
  */
@scala.inline
def stringWriter(): typings.xmlbuilder.mod.XMLWriter = typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stringWriter")().asInstanceOf[typings.xmlbuilder.mod.XMLWriter]
@scala.inline
def stringWriter(options: typings.xmlbuilder.mod.WriterOptions): typings.xmlbuilder.mod.XMLWriter = typings.xmlbuilder.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stringWriter")(options.asInstanceOf[js.Any]).asInstanceOf[typings.xmlbuilder.mod.XMLWriter]

/**
  * A function to be called when a chunk of XML is written.
  * 
  * @param chunk - a chunk of string that was written
  * @param level - current depth of the XML tree
  */
type OnDataCallback = js.Function2[/* chunk */ java.lang.String, /* level */ scala.Double, scala.Unit]

/**
  * A function to be called when the XML doucment is completed.
  */
type OnEndCallback = js.Function0[scala.Unit]
