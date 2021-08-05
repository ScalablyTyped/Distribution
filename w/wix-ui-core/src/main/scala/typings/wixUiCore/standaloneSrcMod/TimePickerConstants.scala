package typings.wixUiCore.standaloneSrcMod

import typings.wixUiCore.anon.Am
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimePickerConstants {
  
  @JSImport("wix-ui-core/dist/standalone/src", "TimePickerConstants.AmPmOptions")
  @js.native
  object AmPmOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.wixUiCore.componentsTimePickerConstantsMod.AmPmOptions & String] = js.native
    
    /* "capitalized" */ val Capitalized: typings.wixUiCore.componentsTimePickerConstantsMod.AmPmOptions.Capitalized & String = js.native
    
    /* "lowercase" */ val Lowercase: typings.wixUiCore.componentsTimePickerConstantsMod.AmPmOptions.Lowercase & String = js.native
    
    /* "none" */ val None: typings.wixUiCore.componentsTimePickerConstantsMod.AmPmOptions.None & String = js.native
    
    /* "uppercase" */ val Uppercase: typings.wixUiCore.componentsTimePickerConstantsMod.AmPmOptions.Uppercase & String = js.native
  }
  
  object AmPmStrings {
    
    @JSImport("wix-ui-core/dist/standalone/src", "TimePickerConstants.AmPmStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src", "TimePickerConstants.AmPmStrings.capitalized")
    @js.native
    def capitalized: Am = js.native
    inline def capitalized_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capitalized")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src", "TimePickerConstants.AmPmStrings.lowercase")
    @js.native
    def lowercase: Am = js.native
    inline def lowercase_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src", "TimePickerConstants.AmPmStrings.uppercase")
    @js.native
    def uppercase: Am = js.native
    inline def uppercase_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/standalone/src", "TimePickerConstants.BLANK")
  @js.native
  val BLANK: /* "--" */ String = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src", "TimePickerConstants.FIELD")
  @js.native
  object FIELD extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.wixUiCore.componentsTimePickerConstantsMod.FIELD & Double] = js.native
    
    /* 4 */ val AFTER: typings.wixUiCore.componentsTimePickerConstantsMod.FIELD.AFTER & Double = js.native
    
    /* 3 */ val AMPM: typings.wixUiCore.componentsTimePickerConstantsMod.FIELD.AMPM & Double = js.native
    
    /* 0 */ val BEFORE: typings.wixUiCore.componentsTimePickerConstantsMod.FIELD.BEFORE & Double = js.native
    
    /* 1 */ val HOUR: typings.wixUiCore.componentsTimePickerConstantsMod.FIELD.HOUR & Double = js.native
    
    /* 2 */ val MINUTE: typings.wixUiCore.componentsTimePickerConstantsMod.FIELD.MINUTE & Double = js.native
  }
  
  @JSImport("wix-ui-core/dist/standalone/src", "TimePickerConstants.NULL_TIME")
  @js.native
  val NULL_TIME: String = js.native
}
