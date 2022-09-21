package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.`class`
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.`final`
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.`private`
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.`protected`
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.baseClass
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.canHaveObjectId
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.constant
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.data
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.dataBreakpoint
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.hasDataBreakpoint
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.hasObjectId
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.hasSideEffects
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.innerClass
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.interface
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.internal
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.method
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.mostDerivedClass
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.property
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.public
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.rawString
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.readOnly
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.static
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.virtual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a variable that can be used to determine how to render the variable in the UI. */
trait VariablePresentationHint extends StObject {
  
  /** Set of attributes represented as an array of strings. Before introducing additional values, try to use the listed values.
  			Values: 
  			'static': Indicates that the object is static.
  			'constant': Indicates that the object is a constant.
  			'readOnly': Indicates that the object is read only.
  			'rawString': Indicates that the object is a raw string.
  			'hasObjectId': Indicates that the object can have an Object ID created for it.
  			'canHaveObjectId': Indicates that the object has an Object ID associated with it.
  			'hasSideEffects': Indicates that the evaluation had side effects.
  			'hasDataBreakpoint': Indicates that the object has its value tracked by a data breakpoint.
  			etc.
  		*/
  var attributes: js.UndefOr[
    js.Array[
      static | constant | readOnly | rawString | hasObjectId | canHaveObjectId | hasSideEffects | hasDataBreakpoint | String
    ]
  ] = js.undefined
  
  /** The kind of variable. Before introducing additional values, try to use the listed values.
  			Values: 
  			'property': Indicates that the object is a property.
  			'method': Indicates that the object is a method.
  			'class': Indicates that the object is a class.
  			'data': Indicates that the object is data.
  			'event': Indicates that the object is an event.
  			'baseClass': Indicates that the object is a base class.
  			'innerClass': Indicates that the object is an inner class.
  			'interface': Indicates that the object is an interface.
  			'mostDerivedClass': Indicates that the object is the most derived class.
  			'virtual': Indicates that the object is virtual, that means it is a synthetic object introduced by the adapter for rendering purposes, e.g. an index range for large arrays.
  			'dataBreakpoint': Deprecated: Indicates that a data breakpoint is registered for the object. The `hasDataBreakpoint` attribute should generally be used instead.
  			etc.
  		*/
  var kind: js.UndefOr[
    property | method | `class` | data | event | baseClass | innerClass | interface | mostDerivedClass | virtual | dataBreakpoint | String
  ] = js.undefined
  
  /** If true, clients can present the variable with a UI that supports a specific gesture to trigger its evaluation.
  			This mechanism can be used for properties that require executing code when retrieving their value and where the code execution can be expensive and/or produce side-effects. A typical example are properties based on a getter function.
  			Please note that in addition to the `lazy` flag, the variable's `variablesReference` is expected to refer to a variable that will provide the value through another `variable` request.
  		*/
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  
  /** Visibility of variable. Before introducing additional values, try to use the listed values.
  			Values: 'public', 'private', 'protected', 'internal', 'final', etc.
  		*/
  var visibility: js.UndefOr[public | `private` | `protected` | internal | `final` | String] = js.undefined
}
object VariablePresentationHint {
  
  inline def apply(): VariablePresentationHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariablePresentationHint]
  }
  
  extension [Self <: VariablePresentationHint](x: Self) {
    
    inline def setAttributes(
      value: js.Array[
          static | constant | readOnly | rawString | hasObjectId | canHaveObjectId | hasSideEffects | hasDataBreakpoint | String
        ]
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(
      value: (static | constant | readOnly | rawString | hasObjectId | canHaveObjectId | hasSideEffects | hasDataBreakpoint | String)*
    ): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setKind(
      value: property | method | `class` | data | event | baseClass | innerClass | interface | mostDerivedClass | virtual | dataBreakpoint | String
    ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setVisibility(value: public | `private` | `protected` | internal | `final` | String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
