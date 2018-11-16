package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScriptElementKind extends js.Object

@JSImport("typescript/ts", "ScriptElementKind")
@js.native
object ScriptElementKind extends js.Object {
  @js.native
  sealed trait alias
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** interface Y { ():number; } */
  @js.native
  sealed trait callSignatureElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** class X {} */
  @js.native
  sealed trait classElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  @js.native
  sealed trait constElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** interface Y { new():Y; } */
  @js.native
  sealed trait constructSignatureElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** class X { constructor() { } } */
  @js.native
  sealed trait constructorImplementationElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  @js.native
  sealed trait directory
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** enum E */
  @js.native
  sealed trait enumElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  @js.native
  sealed trait enumMemberElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  @js.native
  sealed trait externalModuleName
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /**
           * Inside module and script only
           * function f() { }
           */
  @js.native
  sealed trait functionElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** interface Y { []:number; } */
  @js.native
  sealed trait indexSignatureElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** interface Y {} */
  @js.native
  sealed trait interfaceElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /**
           * <JsxTagName attribute1 attribute2={0} />
           */
  @js.native
  sealed trait jsxAttribute
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** predefined type (void) or keyword (class) */
  @js.native
  sealed trait keyword
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  @js.native
  sealed trait label
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  @js.native
  sealed trait letElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** var x = class X {} */
  @js.native
  sealed trait localClassElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** Inside function */
  @js.native
  sealed trait localFunctionElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** Inside function */
  @js.native
  sealed trait localVariableElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** class X { [public|private]* foo() {} } */
  @js.native
  sealed trait memberFunctionElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** class X { [public|private]* [get|set] foo:number; } */
  @js.native
  sealed trait memberGetAccessorElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  @js.native
  sealed trait memberSetAccessorElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /**
           * class X { [public|private]* foo:number; }
           * interface Y { foo:number; }
           */
  @js.native
  sealed trait memberVariableElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** module foo {} */
  @js.native
  sealed trait moduleElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** function foo(*Y*: string) */
  @js.native
  sealed trait parameterElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  @js.native
  sealed trait primitiveType
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** top level script node */
  @js.native
  sealed trait scriptElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** String literal */
  @js.native
  sealed trait string
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /** type T = ... */
  @js.native
  sealed trait typeElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  @js.native
  sealed trait typeParameterElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  @js.native
  sealed trait unknown
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  /**
           * Inside module and script only
           * const v = ..
           */
  @js.native
  sealed trait variableElement
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
  @js.native
  sealed trait warning
    extends typescriptLib.typescriptMod.tsNs.ScriptElementKind
  
}

