package typings.wixStyleReact

import typings.wixStyleReact.anon.ExcludePastTimes
import typings.wixStyleReact.anon.IdValue
import typings.wixStyleReact.anon.InputValueLocale
import typings.wixStyleReact.anon.Locale
import typings.wixStyleReact.anon.Step
import typings.wixStyleReact.anon.TimeSlot
import typings.wixStyleReact.anon.TimeSlots
import typings.wixStyleReact.anon.TimeStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimeInputTimeInputUtilsMod {
  
  @JSImport("wix-style-react/dist/types/TimeInput/TimeInputUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAutoFilledValue(param0: Locale): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoFilledValue")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getClosestTimeSlot(param0: TimeSlots): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClosestTimeSlot")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getCustomTimeSlot(param0: TimeSlot): js.UndefOr[IdValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomTimeSlot")(param0.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IdValue]]
  
  inline def getErrorMessageByLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorMessageByLocale")().asInstanceOf[String]
  
  inline def getFormattedDate(param0: TimeStyle): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormattedDate")(param0.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getSuggestedOption(param0: InputValueLocale): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedOption")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getTimeFilter(param0: ExcludePastTimes): js.Function1[/* time */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeFilter")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* time */ Any, Boolean]]
  
  inline def getTimeSlot(param0: TimeStyle): IdValue = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeSlot")(param0.asInstanceOf[js.Any]).asInstanceOf[IdValue]
  
  inline def getTimeSlots(param0: Step): js.Array[IdValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeSlots")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[IdValue]]
  
  inline def isInputInvalid(inputValue: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInputInvalid")(inputValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def removeIrrelevantCharacters(input: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeIrrelevantCharacters")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
}
