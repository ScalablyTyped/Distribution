package typings.trustedTypes

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.std.Window
import typings.trustedTypes.libMod.TrustedTypePolicyOptions
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
  
  /* was `typeof lib.TrustedTypePolicy` */
  @JSImport("trusted-types", "TrustedTypePolicy")
  @js.native
  abstract class TrustedTypePolicy[Options /* <: TrustedTypePolicyOptions */] ()
    extends typings.trustedTypes.mod.global.TrustedTypePolicy[Options]
  
  /* was `typeof lib.TrustedTypePolicyFactory` */
  @JSImport("trusted-types", "TrustedTypePolicyFactory")
  @js.native
  abstract class TrustedTypePolicyFactory ()
    extends typings.trustedTypes.mod.global.TrustedTypePolicyFactory
  
  @JSImport("trusted-types", "TrustedTypesEnforcer")
  @js.native
  open class TrustedTypesEnforcer protected () extends StObject {
    def this(config: TrustedTypeConfig) = this()
    
    def install(): Unit = js.native
    
    def uninstall(): Unit = js.native
  }
  
  // Re-export the type definitions globally.
  object global {
    
    /* was `typeof lib.TrustedHTML` */
    @JSGlobal("TrustedHTML")
    @js.native
    /* private */ open class TrustedHTML ()
      extends typings.trustedTypes.libMod.TrustedHTML
    
    /* was `typeof lib.TrustedScript` */
    @JSGlobal("TrustedScript")
    @js.native
    /* private */ open class TrustedScript ()
      extends typings.trustedTypes.libMod.TrustedScript
    
    /* was `typeof lib.TrustedScriptURL` */
    @JSGlobal("TrustedScriptURL")
    @js.native
    /* private */ open class TrustedScriptURL ()
      extends typings.trustedTypes.libMod.TrustedScriptURL
    
    /* was `typeof lib.TrustedTypePolicy` */
    @JSGlobal("TrustedTypePolicy")
    @js.native
    abstract class TrustedTypePolicy[Options /* <: typings.trustedTypes.libMod.TrustedTypePolicyOptions */] ()
      extends typings.trustedTypes.libMod.TrustedTypePolicy[Options]
    
    /* was `typeof lib.TrustedTypePolicyFactory` */
    @JSGlobal("TrustedTypePolicyFactory")
    @js.native
    abstract class TrustedTypePolicyFactory ()
      extends typings.trustedTypes.libMod.TrustedTypePolicyFactory
    
    type TrustedTypePolicyOptions = typings.trustedTypes.libMod.TrustedTypePolicyOptions
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
  trait InternalTrustedTypePolicyFactory
    extends typings.trustedTypes.libMod.TrustedTypePolicyFactory {
    
    var TrustedHTML: Instantiable0[typings.trustedTypes.libMod.TrustedHTML] = js.native
    
    var TrustedScript: Instantiable0[typings.trustedTypes.libMod.TrustedScript] = js.native
    
    var TrustedScriptURL: Instantiable0[typings.trustedTypes.libMod.TrustedScriptURL] = js.native
  }
}
