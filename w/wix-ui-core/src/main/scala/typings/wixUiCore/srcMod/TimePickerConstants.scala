package typings.wixUiCore.srcMod

import typings.wixUiCore.anon.Am
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimePickerConstants {
  
  @JSImport("wix-ui-core/dist/src", "TimePickerConstants.AmPmOptions")
  @js.native
  object AmPmOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.wixUiCore.timePickerConstantsMod.AmPmOptions & String] = js.native
    
    /* "capitalized" */ val Capitalized: typings.wixUiCore.timePickerConstantsMod.AmPmOptions.Capitalized & String = js.native
    
    /* "lowercase" */ val Lowercase: typings.wixUiCore.timePickerConstantsMod.AmPmOptions.Lowercase & String = js.native
    
    /* "none" */ val None: typings.wixUiCore.timePickerConstantsMod.AmPmOptions.None & String = js.native
    
    /* "uppercase" */ val Uppercase: typings.wixUiCore.timePickerConstantsMod.AmPmOptions.Uppercase & String = js.native
  }
  
  object AmPmStrings {
    
    @JSImport("wix-ui-core/dist/src", "TimePickerConstants.AmPmStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src", "TimePickerConstants.AmPmStrings.capitalized")
    @js.native
    def capitalized: Am = js.native
    inline def capitalized_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capitalized")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src", "TimePickerConstants.AmPmStrings.lowercase")
    @js.native
    def lowercase: Am = js.native
    inline def lowercase_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lowercase")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src", "TimePickerConstants.AmPmStrings.uppercase")
    @js.native
    def uppercase: Am = js.native
    inline def uppercase_=(x: Am): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uppercase")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/src", "TimePickerConstants.BLANK")
  @js.native
  val BLANK: /* "--" */ String = js.native
  
  @JSImport("wix-ui-core/dist/src", "TimePickerConstants.FIELD")
  @js.native
  object FIELD extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.wixUiCore.timePickerConstantsMod.FIELD & Double] = js.native
    
    /* 4 */ val AFTER: typings.wixUiCore.timePickerConstantsMod.FIELD.AFTER & Double = js.native
    
    /* 3 */ val AMPM: typings.wixUiCore.timePickerConstantsMod.FIELD.AMPM & Double = js.native
    
    /* 0 */ val BEFORE: typings.wixUiCore.timePickerConstantsMod.FIELD.BEFORE & Double = js.native
    
    /* 1 */ val HOUR: typings.wixUiCore.timePickerConstantsMod.FIELD.HOUR & Double = js.native
    
    /* 2 */ val MINUTE: typings.wixUiCore.timePickerConstantsMod.FIELD.MINUTE & Double = js.native
  }
  
  @JSImport("wix-ui-core/dist/src", "TimePickerConstants.NULL_TIME")
  @js.native
  val NULL_TIME: String = js.native
}
