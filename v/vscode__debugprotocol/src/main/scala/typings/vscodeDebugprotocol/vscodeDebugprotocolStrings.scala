package typings.vscodeDebugprotocol

import typings.vscodeDebugprotocol.mod.DebugProtocol.ChecksumAlgorithm
import typings.vscodeDebugprotocol.mod.DebugProtocol.CompletionItemType
import typings.vscodeDebugprotocol.mod.DebugProtocol.DataBreakpointAccessType
import typings.vscodeDebugprotocol.mod.DebugProtocol.ExceptionBreakMode
import typings.vscodeDebugprotocol.mod.DebugProtocol.SteppingGranularity
import typings.vscodeDebugprotocol.mod.DebugProtocol._InvalidatedAreas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vscodeDebugprotocolStrings {
  
  @js.native
  sealed trait MD5
    extends StObject
       with ChecksumAlgorithm
  inline def MD5: MD5 = "MD5".asInstanceOf[MD5]
  
  @js.native
  sealed trait SHA1
    extends StObject
       with ChecksumAlgorithm
  inline def SHA1: SHA1 = "SHA1".asInstanceOf[SHA1]
  
  @js.native
  sealed trait SHA256
    extends StObject
       with ChecksumAlgorithm
  inline def SHA256: SHA256 = "SHA256".asInstanceOf[SHA256]
  
  @js.native
  sealed trait all
    extends StObject
       with _InvalidatedAreas
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait always
    extends StObject
       with ExceptionBreakMode
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait arguments extends StObject
  inline def arguments: arguments = "arguments".asInstanceOf[arguments]
  
  @js.native
  sealed trait attach extends StObject
  inline def attach: attach = "attach".asInstanceOf[attach]
  
  @js.native
  sealed trait attachForSuspendedLaunch extends StObject
  inline def attachForSuspendedLaunch: attachForSuspendedLaunch = "attachForSuspendedLaunch".asInstanceOf[attachForSuspendedLaunch]
  
  @js.native
  sealed trait baseClass extends StObject
  inline def baseClass: baseClass = "baseClass".asInstanceOf[baseClass]
  
  @js.native
  sealed trait boolean extends StObject
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait breakpoint extends StObject
  inline def breakpoint: breakpoint = "breakpoint".asInstanceOf[breakpoint]
  
  @js.native
  sealed trait canHaveObjectId extends StObject
  inline def canHaveObjectId: canHaveObjectId = "canHaveObjectId".asInstanceOf[canHaveObjectId]
  
  @js.native
  sealed trait cancelled extends StObject
  inline def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait changed extends StObject
  inline def changed: changed = "changed".asInstanceOf[changed]
  
  @js.native
  sealed trait `class`
    extends StObject
       with CompletionItemType
  inline def `class`: `class` = "class".asInstanceOf[`class`]
  
  @js.native
  sealed trait clipboard extends StObject
  inline def clipboard: clipboard = "clipboard".asInstanceOf[clipboard]
  
  @js.native
  sealed trait color
    extends StObject
       with CompletionItemType
  inline def color: color = "color".asInstanceOf[color]
  
  @js.native
  sealed trait console extends StObject
  inline def console: console = "console".asInstanceOf[console]
  
  @js.native
  sealed trait constant extends StObject
  inline def constant: constant = "constant".asInstanceOf[constant]
  
  @js.native
  sealed trait constructor
    extends StObject
       with CompletionItemType
  inline def constructor: constructor = "constructor".asInstanceOf[constructor]
  
  @js.native
  sealed trait customcolor
    extends StObject
       with CompletionItemType
  inline def customcolor: customcolor = "customcolor".asInstanceOf[customcolor]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait `data breakpoint` extends StObject
  inline def `data breakpoint`: `data breakpoint` = ("data breakpoint").asInstanceOf[`data breakpoint`]
  
  @js.native
  sealed trait dataBreakpoint extends StObject
  inline def dataBreakpoint: dataBreakpoint = "dataBreakpoint".asInstanceOf[dataBreakpoint]
  
  @js.native
  sealed trait deemphasize extends StObject
  inline def deemphasize: deemphasize = "deemphasize".asInstanceOf[deemphasize]
  
  @js.native
  sealed trait emphasize extends StObject
  inline def emphasize: emphasize = "emphasize".asInstanceOf[emphasize]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait entry extends StObject
  inline def entry: entry = "entry".asInstanceOf[entry]
  
  @js.native
  sealed trait `enum`
    extends StObject
       with CompletionItemType
  inline def `enum`: `enum` = "enum".asInstanceOf[`enum`]
  
  @js.native
  sealed trait event extends StObject
  inline def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait exception extends StObject
  inline def exception: exception = "exception".asInstanceOf[exception]
  
  @js.native
  sealed trait exited extends StObject
  inline def exited: exited = "exited".asInstanceOf[exited]
  
  @js.native
  sealed trait external extends StObject
  inline def external: external = "external".asInstanceOf[external]
  
  @js.native
  sealed trait field
    extends StObject
       with CompletionItemType
  inline def field: field = "field".asInstanceOf[field]
  
  @js.native
  sealed trait file
    extends StObject
       with CompletionItemType
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait `final` extends StObject
  inline def `final`: `final` = "final".asInstanceOf[`final`]
  
  @js.native
  sealed trait function
    extends StObject
       with CompletionItemType
  inline def function: function = "function".asInstanceOf[function]
  
  @js.native
  sealed trait `function breakpoint` extends StObject
  inline def `function breakpoint`: `function breakpoint` = ("function breakpoint").asInstanceOf[`function breakpoint`]
  
  @js.native
  sealed trait goto extends StObject
  inline def goto: goto = "goto".asInstanceOf[goto]
  
  @js.native
  sealed trait hasDataBreakpoint extends StObject
  inline def hasDataBreakpoint: hasDataBreakpoint = "hasDataBreakpoint".asInstanceOf[hasDataBreakpoint]
  
  @js.native
  sealed trait hasObjectId extends StObject
  inline def hasObjectId: hasObjectId = "hasObjectId".asInstanceOf[hasObjectId]
  
  @js.native
  sealed trait hasSideEffects extends StObject
  inline def hasSideEffects: hasSideEffects = "hasSideEffects".asInstanceOf[hasSideEffects]
  
  @js.native
  sealed trait hover extends StObject
  inline def hover: hover = "hover".asInstanceOf[hover]
  
  @js.native
  sealed trait important extends StObject
  inline def important: important = "important".asInstanceOf[important]
  
  @js.native
  sealed trait indexed extends StObject
  inline def indexed: indexed = "indexed".asInstanceOf[indexed]
  
  @js.native
  sealed trait innerClass extends StObject
  inline def innerClass: innerClass = "innerClass".asInstanceOf[innerClass]
  
  @js.native
  sealed trait instruction
    extends StObject
       with SteppingGranularity
  inline def instruction: instruction = "instruction".asInstanceOf[instruction]
  
  @js.native
  sealed trait `instruction breakpoint` extends StObject
  inline def `instruction breakpoint`: `instruction breakpoint` = ("instruction breakpoint").asInstanceOf[`instruction breakpoint`]
  
  @js.native
  sealed trait integrated extends StObject
  inline def integrated: integrated = "integrated".asInstanceOf[integrated]
  
  @js.native
  sealed trait interface
    extends StObject
       with CompletionItemType
  inline def interface: interface = "interface".asInstanceOf[interface]
  
  @js.native
  sealed trait internal extends StObject
  inline def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait keyword
    extends StObject
       with CompletionItemType
  inline def keyword: keyword = "keyword".asInstanceOf[keyword]
  
  @js.native
  sealed trait label extends StObject
  inline def label: label = "label".asInstanceOf[label]
  
  @js.native
  sealed trait launch extends StObject
  inline def launch: launch = "launch".asInstanceOf[launch]
  
  @js.native
  sealed trait line
    extends StObject
       with SteppingGranularity
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait locals extends StObject
  inline def locals: locals = "locals".asInstanceOf[locals]
  
  @js.native
  sealed trait method
    extends StObject
       with CompletionItemType
  inline def method: method = "method".asInstanceOf[method]
  
  @js.native
  sealed trait module
    extends StObject
       with CompletionItemType
  inline def module: module = "module".asInstanceOf[module]
  
  @js.native
  sealed trait mostDerivedClass extends StObject
  inline def mostDerivedClass: mostDerivedClass = "mostDerivedClass".asInstanceOf[mostDerivedClass]
  
  @js.native
  sealed trait named extends StObject
  inline def named: named = "named".asInstanceOf[named]
  
  @js.native
  sealed trait never
    extends StObject
       with ExceptionBreakMode
  inline def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait `new` extends StObject
  inline def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait normal extends StObject
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait notStopped extends StObject
  inline def notStopped: notStopped = "notStopped".asInstanceOf[notStopped]
  
  @js.native
  sealed trait number extends StObject
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait path extends StObject
  inline def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait pause extends StObject
  inline def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait `private` extends StObject
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait property
    extends StObject
       with CompletionItemType
  inline def property: property = "property".asInstanceOf[property]
  
  @js.native
  sealed trait `protected` extends StObject
  inline def `protected`: `protected` = "protected".asInstanceOf[`protected`]
  
  @js.native
  sealed trait public extends StObject
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait rawString extends StObject
  inline def rawString: rawString = "rawString".asInstanceOf[rawString]
  
  @js.native
  sealed trait read
    extends StObject
       with DataBreakpointAccessType
  inline def read: read = "read".asInstanceOf[read]
  
  @js.native
  sealed trait readOnly extends StObject
  inline def readOnly: readOnly = "readOnly".asInstanceOf[readOnly]
  
  @js.native
  sealed trait readWrite
    extends StObject
       with DataBreakpointAccessType
  inline def readWrite: readWrite = "readWrite".asInstanceOf[readWrite]
  
  @js.native
  sealed trait reference
    extends StObject
       with CompletionItemType
  inline def reference: reference = "reference".asInstanceOf[reference]
  
  @js.native
  sealed trait registers extends StObject
  inline def registers: registers = "registers".asInstanceOf[registers]
  
  @js.native
  sealed trait removed extends StObject
  inline def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait repl extends StObject
  inline def repl: repl = "repl".asInstanceOf[repl]
  
  @js.native
  sealed trait request extends StObject
  inline def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait response extends StObject
  inline def response: response = "response".asInstanceOf[response]
  
  @js.native
  sealed trait snippet
    extends StObject
       with CompletionItemType
  inline def snippet: snippet = "snippet".asInstanceOf[snippet]
  
  @js.native
  sealed trait stacks
    extends StObject
       with _InvalidatedAreas
  inline def stacks: stacks = "stacks".asInstanceOf[stacks]
  
  @js.native
  sealed trait start extends StObject
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait startCollapsed extends StObject
  inline def startCollapsed: startCollapsed = "startCollapsed".asInstanceOf[startCollapsed]
  
  @js.native
  sealed trait started extends StObject
  inline def started: started = "started".asInstanceOf[started]
  
  @js.native
  sealed trait statement
    extends StObject
       with SteppingGranularity
  inline def statement: statement = "statement".asInstanceOf[statement]
  
  @js.native
  sealed trait static extends StObject
  inline def static: static = "static".asInstanceOf[static]
  
  @js.native
  sealed trait stderr extends StObject
  inline def stderr: stderr = "stderr".asInstanceOf[stderr]
  
  @js.native
  sealed trait stdout extends StObject
  inline def stdout: stdout = "stdout".asInstanceOf[stdout]
  
  @js.native
  sealed trait step extends StObject
  inline def step: step = "step".asInstanceOf[step]
  
  @js.native
  sealed trait string extends StObject
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait subtle extends StObject
  inline def subtle: subtle = "subtle".asInstanceOf[subtle]
  
  @js.native
  sealed trait telemetry extends StObject
  inline def telemetry: telemetry = "telemetry".asInstanceOf[telemetry]
  
  @js.native
  sealed trait text
    extends StObject
       with CompletionItemType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait threads
    extends StObject
       with _InvalidatedAreas
  inline def threads: threads = "threads".asInstanceOf[threads]
  
  @js.native
  sealed trait timestamp
    extends StObject
       with ChecksumAlgorithm
  inline def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  
  @js.native
  sealed trait unhandled
    extends StObject
       with ExceptionBreakMode
  inline def unhandled: unhandled = "unhandled".asInstanceOf[unhandled]
  
  @js.native
  sealed trait unit
    extends StObject
       with CompletionItemType
  inline def unit: unit = "unit".asInstanceOf[unit]
  
  @js.native
  sealed trait unixTimestampUTC extends StObject
  inline def unixTimestampUTC: unixTimestampUTC = "unixTimestampUTC".asInstanceOf[unixTimestampUTC]
  
  @js.native
  sealed trait uri extends StObject
  inline def uri: uri = "uri".asInstanceOf[uri]
  
  @js.native
  sealed trait userUnhandled
    extends StObject
       with ExceptionBreakMode
  inline def userUnhandled: userUnhandled = "userUnhandled".asInstanceOf[userUnhandled]
  
  @js.native
  sealed trait value
    extends StObject
       with CompletionItemType
  inline def value: value = "value".asInstanceOf[value]
  
  @js.native
  sealed trait variable
    extends StObject
       with CompletionItemType
  inline def variable: variable = "variable".asInstanceOf[variable]
  
  @js.native
  sealed trait variables
    extends StObject
       with _InvalidatedAreas
  inline def variables: variables = "variables".asInstanceOf[variables]
  
  @js.native
  sealed trait virtual extends StObject
  inline def virtual: virtual = "virtual".asInstanceOf[virtual]
  
  @js.native
  sealed trait watch extends StObject
  inline def watch: watch = "watch".asInstanceOf[watch]
  
  @js.native
  sealed trait write
    extends StObject
       with DataBreakpointAccessType
  inline def write: write = "write".asInstanceOf[write]
}
