package typings.trustedTypes

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.std.Window
import typings.trustedTypes.libMod.TrustedTypePolicyFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("trusted-types", "TrustedTypeConfig")
  @js.native
  open class TrustedTypeConfig protected () extends StObject {
    def this(
      isLoggingEnabled: Boolean,
      isEnforcementEnabled: Boolean,
      allowedPolicyNames: js.Array[String],
      allowDuplicates: Boolean
    ) = this()
    def this(
      isLoggingEnabled: Boolean,
      isEnforcementEnabled: Boolean,
      allowedPolicyNames: js.Array[String],
      allowDuplicates: Boolean,
      cspString: String
    ) = this()
    def this(
      isLoggingEnabled: Boolean,
      isEnforcementEnabled: Boolean,
      allowedPolicyNames: js.Array[String],
      allowDuplicates: Boolean,
      cspString: String,
      windowObject: Window
    ) = this()
    def this(
      isLoggingEnabled: Boolean,
      isEnforcementEnabled: Boolean,
      allowedPolicyNames: js.Array[String],
      allowDuplicates: Boolean,
      cspString: Null,
      windowObject: Window
    ) = this()
    def this(
      isLoggingEnabled: Boolean,
      isEnforcementEnabled: Boolean,
      allowedPolicyNames: js.Array[String],
      allowDuplicates: Boolean,
      cspString: Unit,
      windowObject: Window
    ) = this()
  }
  
  @JSImport("trusted-types", "TrustedTypesEnforcer")
  @js.native
  open class TrustedTypesEnforcer protected () extends StObject {
    def this(config: TrustedTypeConfig) = this()
    
    def install(): Unit = js.native
    
    def uninstall(): Unit = js.native
  }
  
  object trustedTypes extends Shortcut {
    
    @JSImport("trusted-types", "trustedTypes")
    @js.native
    val ^ : InternalTrustedTypePolicyFactory = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("trusted-types", "trustedTypes.TrustedHTML")
    @js.native
    open class TrustedHTML ()
      extends typings.trustedTypes.libMod.TrustedHTML
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("trusted-types", "trustedTypes.TrustedScript")
    @js.native
    open class TrustedScript ()
      extends typings.trustedTypes.libMod.TrustedScript
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("trusted-types", "trustedTypes.TrustedScriptURL")
    @js.native
    open class TrustedScriptURL ()
      extends typings.trustedTypes.libMod.TrustedScriptURL
    
    type _To = InternalTrustedTypePolicyFactory
    
    /* This means you don't have to write `^`, but can instead just say `trustedTypes.foo` */
    override def _to: InternalTrustedTypePolicyFactory = ^
  }
  
  // These are the available exports when using the polyfill as npm package (e.g. in nodejs)
  @js.native
  trait InternalTrustedTypePolicyFactory extends TrustedTypePolicyFactory {
    
    var TrustedHTML: Instantiable0[typings.trustedTypes.libMod.TrustedHTML] = js.native
    
    var TrustedScript: Instantiable0[typings.trustedTypes.libMod.TrustedScript] = js.native
    
    var TrustedScriptURL: Instantiable0[typings.trustedTypes.libMod.TrustedScriptURL] = js.native
  }
  
  // Re-export the type definitions globally.
  object global {
    
    // tslint:disable-next-line no-empty-interface -- interface to allow module augmentation
    type TrustedHTML = typings.trustedTypes.libMod.TrustedHTML
    
    // tslint:disable-next-line no-empty-interface -- interface to allow module augmentation
    type TrustedScript = typings.trustedTypes.libMod.TrustedScript
    
    // tslint:disable-next-line no-empty-interface -- interface to allow module augmentation
    type TrustedScriptURL = typings.trustedTypes.libMod.TrustedScriptURL
    
    // tslint:disable-next-line no-empty-interface -- interface to allow module augmentation
    type TrustedTypePolicy = typings.trustedTypes.libMod.TrustedTypePolicy[typings.trustedTypes.libMod.TrustedTypePolicyOptions]
    
    // tslint:disable-next-line no-empty-interface -- interface to allow module augmentation
    type TrustedTypePolicyFactory = typings.trustedTypes.libMod.TrustedTypePolicyFactory
    
    // tslint:disable-next-line no-empty-interface -- interface to allow module augmentation
    type TrustedTypePolicyOptions = typings.trustedTypes.libMod.TrustedTypePolicyOptions
  }
}
