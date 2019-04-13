package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScriptElementKind extends js.Object

@JSImport("typescript", "ScriptElementKind")
@js.native
object ScriptElementKind extends js.Object {
  @js.native
  sealed trait alias
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** interface Y { ():number; } */
  @js.native
  sealed trait callSignatureElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** class X {} */
  @js.native
  sealed trait classElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  @js.native
  sealed trait constElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** interface Y { new():Y; } */
  @js.native
  sealed trait constructSignatureElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** class X { constructor() { } } */
  @js.native
  sealed trait constructorImplementationElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  @js.native
  sealed trait directory
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** enum E */
  @js.native
  sealed trait enumElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  @js.native
  sealed trait enumMemberElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  @js.native
  sealed trait externalModuleName
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /**
    * Inside module and script only
    * function f() { }
    */
  @js.native
  sealed trait functionElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** interface Y { []:number; } */
  @js.native
  sealed trait indexSignatureElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** interface Y {} */
  @js.native
  sealed trait interfaceElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /**
    * <JsxTagName attribute1 attribute2={0} />
    */
  @js.native
  sealed trait jsxAttribute
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** predefined type (void) or keyword (class) */
  @js.native
  sealed trait keyword
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  @js.native
  sealed trait label
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  @js.native
  sealed trait letElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** var x = class X {} */
  @js.native
  sealed trait localClassElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** Inside function */
  @js.native
  sealed trait localFunctionElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** Inside function */
  @js.native
  sealed trait localVariableElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** class X { [public|private]* foo() {} } */
  @js.native
  sealed trait memberFunctionElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** class X { [public|private]* [get|set] foo:number; } */
  @js.native
  sealed trait memberGetAccessorElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  @js.native
  sealed trait memberSetAccessorElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /**
    * class X { [public|private]* foo:number; }
    * interface Y { foo:number; }
    */
  @js.native
  sealed trait memberVariableElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** module foo {} */
  @js.native
  sealed trait moduleElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** function foo(*Y*: string) */
  @js.native
  sealed trait parameterElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  @js.native
  sealed trait primitiveType
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** top level script node */
  @js.native
  sealed trait scriptElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** String literal */
  @js.native
  sealed trait string
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /** type T = ... */
  @js.native
  sealed trait typeElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  @js.native
  sealed trait typeParameterElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  @js.native
  sealed trait unknown
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /**
    * Inside module and script only
    * const v = ..
    */
  @js.native
  sealed trait variableElement
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  @js.native
  sealed trait warning
    extends typescriptLib.typescriptMod.ScriptElementKind
  
  /* "alias" */ val alias: alias with java.lang.String = js.native
  /* "call" */ val callSignatureElement: callSignatureElement with java.lang.String = js.native
  /* "class" */ val classElement: classElement with java.lang.String = js.native
  /* "const" */ val constElement: constElement with java.lang.String = js.native
  /* "construct" */ val constructSignatureElement: constructSignatureElement with java.lang.String = js.native
  /* "constructor" */ val constructorImplementationElement: constructorImplementationElement with java.lang.String = js.native
  /* "directory" */ val directory: directory with java.lang.String = js.native
  /* "enum" */ val enumElement: enumElement with java.lang.String = js.native
  /* "enum member" */ val enumMemberElement: enumMemberElement with java.lang.String = js.native
  /* "external module name" */ val externalModuleName: externalModuleName with java.lang.String = js.native
  /* "function" */ val functionElement: functionElement with java.lang.String = js.native
  /* "index" */ val indexSignatureElement: indexSignatureElement with java.lang.String = js.native
  /* "interface" */ val interfaceElement: interfaceElement with java.lang.String = js.native
  /* "JSX attribute" */ val jsxAttribute: jsxAttribute with java.lang.String = js.native
  /* "keyword" */ val keyword: keyword with java.lang.String = js.native
  /* "label" */ val label: label with java.lang.String = js.native
  /* "let" */ val letElement: letElement with java.lang.String = js.native
  /* "local class" */ val localClassElement: localClassElement with java.lang.String = js.native
  /* "local function" */ val localFunctionElement: localFunctionElement with java.lang.String = js.native
  /* "local var" */ val localVariableElement: localVariableElement with java.lang.String = js.native
  /* "method" */ val memberFunctionElement: memberFunctionElement with java.lang.String = js.native
  /* "getter" */ val memberGetAccessorElement: memberGetAccessorElement with java.lang.String = js.native
  /* "setter" */ val memberSetAccessorElement: memberSetAccessorElement with java.lang.String = js.native
  /* "property" */ val memberVariableElement: memberVariableElement with java.lang.String = js.native
  /* "module" */ val moduleElement: moduleElement with java.lang.String = js.native
  /* "parameter" */ val parameterElement: parameterElement with java.lang.String = js.native
  /* "primitive type" */ val primitiveType: primitiveType with java.lang.String = js.native
  /* "script" */ val scriptElement: scriptElement with java.lang.String = js.native
  /* "string" */ val string: string with java.lang.String = js.native
  /* "type" */ val typeElement: typeElement with java.lang.String = js.native
  /* "type parameter" */ val typeParameterElement: typeParameterElement with java.lang.String = js.native
  /* "" */ val unknown: unknown with java.lang.String = js.native
  /* "var" */ val variableElement: variableElement with java.lang.String = js.native
  /* "warning" */ val warning: warning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[typescriptLib.typescriptMod.ScriptElementKind with java.lang.String] = js.native
}

