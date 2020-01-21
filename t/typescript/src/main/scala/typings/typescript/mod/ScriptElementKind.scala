package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScriptElementKind extends js.Object

@JSImport("typescript", "ScriptElementKind")
@js.native
object ScriptElementKind extends js.Object {
  @js.native
  sealed trait alias extends ScriptElementKind
  
  /** interface Y { ():number; } */
  @js.native
  sealed trait callSignatureElement extends ScriptElementKind
  
  /** class X {} */
  @js.native
  sealed trait classElement extends ScriptElementKind
  
  @js.native
  sealed trait constElement extends ScriptElementKind
  
  /** interface Y { new():Y; } */
  @js.native
  sealed trait constructSignatureElement extends ScriptElementKind
  
  /** class X { constructor() { } } */
  @js.native
  sealed trait constructorImplementationElement extends ScriptElementKind
  
  @js.native
  sealed trait directory extends ScriptElementKind
  
  /** enum E */
  @js.native
  sealed trait enumElement extends ScriptElementKind
  
  @js.native
  sealed trait enumMemberElement extends ScriptElementKind
  
  @js.native
  sealed trait externalModuleName extends ScriptElementKind
  
  /**
    * Inside module and script only
    * function f() { }
    */
  @js.native
  sealed trait functionElement extends ScriptElementKind
  
  /** interface Y { []:number; } */
  @js.native
  sealed trait indexSignatureElement extends ScriptElementKind
  
  /** interface Y {} */
  @js.native
  sealed trait interfaceElement extends ScriptElementKind
  
  /**
    * <JsxTagName attribute1 attribute2={0} />
    */
  @js.native
  sealed trait jsxAttribute extends ScriptElementKind
  
  /** predefined type (void) or keyword (class) */
  @js.native
  sealed trait keyword extends ScriptElementKind
  
  @js.native
  sealed trait label extends ScriptElementKind
  
  @js.native
  sealed trait letElement extends ScriptElementKind
  
  /** var x = class X {} */
  @js.native
  sealed trait localClassElement extends ScriptElementKind
  
  /** Inside function */
  @js.native
  sealed trait localFunctionElement extends ScriptElementKind
  
  /** Inside function */
  @js.native
  sealed trait localVariableElement extends ScriptElementKind
  
  /** class X { [public|private]* foo() {} } */
  @js.native
  sealed trait memberFunctionElement extends ScriptElementKind
  
  /** class X { [public|private]* [get|set] foo:number; } */
  @js.native
  sealed trait memberGetAccessorElement extends ScriptElementKind
  
  @js.native
  sealed trait memberSetAccessorElement extends ScriptElementKind
  
  /**
    * class X { [public|private]* foo:number; }
    * interface Y { foo:number; }
    */
  @js.native
  sealed trait memberVariableElement extends ScriptElementKind
  
  /** module foo {} */
  @js.native
  sealed trait moduleElement extends ScriptElementKind
  
  /** function foo(*Y*: string) */
  @js.native
  sealed trait parameterElement extends ScriptElementKind
  
  @js.native
  sealed trait primitiveType extends ScriptElementKind
  
  /** top level script node */
  @js.native
  sealed trait scriptElement extends ScriptElementKind
  
  /** String literal */
  @js.native
  sealed trait string extends ScriptElementKind
  
  /** type T = ... */
  @js.native
  sealed trait typeElement extends ScriptElementKind
  
  @js.native
  sealed trait typeParameterElement extends ScriptElementKind
  
  @js.native
  sealed trait unknown extends ScriptElementKind
  
  /**
    * Inside module and script only
    * const v = ..
    */
  @js.native
  sealed trait variableElement extends ScriptElementKind
  
  @js.native
  sealed trait warning extends ScriptElementKind
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ScriptElementKind with java.lang.String] = js.native
  /* "alias" */ @js.native
  object alias
    extends TopLevel[alias with java.lang.String]
  
  /* "call" */ @js.native
  object callSignatureElement
    extends TopLevel[callSignatureElement with java.lang.String]
  
  /* "class" */ @js.native
  object classElement
    extends TopLevel[classElement with java.lang.String]
  
  /* "const" */ @js.native
  object constElement
    extends TopLevel[constElement with java.lang.String]
  
  /* "construct" */ @js.native
  object constructSignatureElement
    extends TopLevel[constructSignatureElement with java.lang.String]
  
  /* "constructor" */ @js.native
  object constructorImplementationElement
    extends TopLevel[constructorImplementationElement with java.lang.String]
  
  /* "directory" */ @js.native
  object directory
    extends TopLevel[directory with java.lang.String]
  
  /* "enum" */ @js.native
  object enumElement
    extends TopLevel[enumElement with java.lang.String]
  
  /* "enum member" */ @js.native
  object enumMemberElement
    extends TopLevel[enumMemberElement with java.lang.String]
  
  /* "external module name" */ @js.native
  object externalModuleName
    extends TopLevel[externalModuleName with java.lang.String]
  
  /* "function" */ @js.native
  object functionElement
    extends TopLevel[functionElement with java.lang.String]
  
  /* "index" */ @js.native
  object indexSignatureElement
    extends TopLevel[indexSignatureElement with java.lang.String]
  
  /* "interface" */ @js.native
  object interfaceElement
    extends TopLevel[interfaceElement with java.lang.String]
  
  /* "JSX attribute" */ @js.native
  object jsxAttribute
    extends TopLevel[jsxAttribute with java.lang.String]
  
  /* "keyword" */ @js.native
  object keyword
    extends TopLevel[keyword with java.lang.String]
  
  /* "label" */ @js.native
  object label
    extends TopLevel[label with java.lang.String]
  
  /* "let" */ @js.native
  object letElement
    extends TopLevel[letElement with java.lang.String]
  
  /* "local class" */ @js.native
  object localClassElement
    extends TopLevel[localClassElement with java.lang.String]
  
  /* "local function" */ @js.native
  object localFunctionElement
    extends TopLevel[localFunctionElement with java.lang.String]
  
  /* "local var" */ @js.native
  object localVariableElement
    extends TopLevel[localVariableElement with java.lang.String]
  
  /* "method" */ @js.native
  object memberFunctionElement
    extends TopLevel[memberFunctionElement with java.lang.String]
  
  /* "getter" */ @js.native
  object memberGetAccessorElement
    extends TopLevel[memberGetAccessorElement with java.lang.String]
  
  /* "setter" */ @js.native
  object memberSetAccessorElement
    extends TopLevel[memberSetAccessorElement with java.lang.String]
  
  /* "property" */ @js.native
  object memberVariableElement
    extends TopLevel[memberVariableElement with java.lang.String]
  
  /* "module" */ @js.native
  object moduleElement
    extends TopLevel[moduleElement with java.lang.String]
  
  /* "parameter" */ @js.native
  object parameterElement
    extends TopLevel[parameterElement with java.lang.String]
  
  /* "primitive type" */ @js.native
  object primitiveType
    extends TopLevel[primitiveType with java.lang.String]
  
  /* "script" */ @js.native
  object scriptElement
    extends TopLevel[scriptElement with java.lang.String]
  
  /* "string" */ @js.native
  object string
    extends TopLevel[string with java.lang.String]
  
  /* "type" */ @js.native
  object typeElement
    extends TopLevel[typeElement with java.lang.String]
  
  /* "type parameter" */ @js.native
  object typeParameterElement
    extends TopLevel[typeParameterElement with java.lang.String]
  
  /* "" */ @js.native
  object unknown
    extends TopLevel[unknown with java.lang.String]
  
  /* "var" */ @js.native
  object variableElement
    extends TopLevel[variableElement with java.lang.String]
  
  /* "warning" */ @js.native
  object warning
    extends TopLevel[warning with java.lang.String]
  
}

