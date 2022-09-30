package typings.wdioUtils

import typings.std.Record
import typings.wdioTypes.capabilitiesMod.Capabilities
import typings.wdioTypes.capabilitiesMod.DesiredCapabilities
import typings.wdioTypes.optionsMod.Testrunner
import typings.wdioTypes.servicesMod.RunnerPlugin
import typings.wdioTypes.servicesMod.ServiceInstance
import typings.wdioTypes.servicesMod.ServicePlugin
import typings.wdioUtils.anon.Call
import typings.wdioUtils.anon.File
import typings.wdioUtils.anon.IgnoredWorkerServices
import typings.wdioUtils.anon.IsAndroid
import typings.wdioUtils.anon.IsChrome
import typings.wdioUtils.anon.IsDevTools
import typings.wdioUtils.anon.OmitTestrunnercapabilitie
import typings.wdioUtils.monadMod.PropertiesObject
import typings.wdioUtils.shimMod.Retries
import typings.wdioUtils.typesMod.AfterHookParam
import typings.wdioUtils.typesMod.BeforeHookParam
import typings.wdioUtils.typesMod.HookFnArgs
import typings.wdioUtils.typesMod.SpecFunction
import typings.wdioUtils.wdioUtilsStrings.`QuotationmarkLessthansignScreenshot[base64]GreaterthansignQuotationmark`
import typings.wdioUtils.wdioUtilsStrings.`QuotationmarkLessthansignScript[base64]GreaterthansignQuotationmark`
import typings.wdioUtils.wdioUtilsStrings.`null`
import typings.wdioUtils.wdioUtilsStrings.`object`
import typings.wdioUtils.wdioUtilsStrings.bigint
import typings.wdioUtils.wdioUtilsStrings.boolean
import typings.wdioUtils.wdioUtilsStrings.function
import typings.wdioUtils.wdioUtilsStrings.number
import typings.wdioUtils.wdioUtilsStrings.string
import typings.wdioUtils.wdioUtilsStrings.symbol
import typings.wdioUtils.wdioUtilsStrings.undefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wdio/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object UNICODE_CHARACTERS {
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Add")
    @js.native
    def Add: String = js.native
    inline def Add_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Add")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Alt")
    @js.native
    def Alt: String = js.native
    inline def Alt_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Alt")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.ArrowDown")
    @js.native
    def ArrowDown: String = js.native
    inline def ArrowDown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrowDown")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.ArrowLeft")
    @js.native
    def ArrowLeft: String = js.native
    inline def ArrowLeft_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrowLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.ArrowRight")
    @js.native
    def ArrowRight: String = js.native
    inline def ArrowRight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrowRight")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.ArrowUp")
    @js.native
    def ArrowUp: String = js.native
    inline def ArrowUp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ArrowUp")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Arrow_Down")
    @js.native
    def Arrow_Down: String = js.native
    inline def Arrow_Down_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arrow_Down")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Arrow_Left")
    @js.native
    def Arrow_Left: String = js.native
    inline def Arrow_Left_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arrow_Left")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Arrow_Right")
    @js.native
    def Arrow_Right: String = js.native
    inline def Arrow_Right_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arrow_Right")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Arrow_Up")
    @js.native
    def Arrow_Up: String = js.native
    inline def Arrow_Up_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arrow_Up")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Back space")
    @js.native
    val `Back space`: String = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Backspace")
    @js.native
    def Backspace: String = js.native
    inline def Backspace_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Backspace")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Cancel")
    @js.native
    def Cancel: String = js.native
    inline def Cancel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Clear")
    @js.native
    def Clear: String = js.native
    inline def Clear_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Clear")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Command")
    @js.native
    def Command: String = js.native
    inline def Command_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Command")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Control")
    @js.native
    def Control: String = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Control Left")
    @js.native
    def ControlLeft: String = js.native
    
    inline def ControlLeft_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Control Left")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Control Right")
    @js.native
    def ControlRight: String = js.native
    
    inline def ControlRight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Control Right")(x.asInstanceOf[js.Any])
    
    inline def Control_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Control")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Decimal")
    @js.native
    def Decimal: String = js.native
    inline def Decimal_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Delete")
    @js.native
    def Delete: String = js.native
    inline def Delete_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Delete")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Divide")
    @js.native
    def Divide: String = js.native
    inline def Divide_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divide")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Down arrow")
    @js.native
    def DownArrow: String = js.native
    
    inline def DownArrow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Down arrow")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.End")
    @js.native
    def End: String = js.native
    inline def End_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("End")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Enter")
    @js.native
    def Enter: String = js.native
    inline def Enter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Enter")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Equals")
    @js.native
    def Equals: String = js.native
    inline def Equals_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Equals")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Escape")
    @js.native
    def Escape: String = js.native
    inline def Escape_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Escape")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F1")
    @js.native
    def F1: String = js.native
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F10")
    @js.native
    def F10: String = js.native
    inline def F10_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F10")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F11")
    @js.native
    def F11: String = js.native
    inline def F11_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F11")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F12")
    @js.native
    def F12: String = js.native
    inline def F12_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F12")(x.asInstanceOf[js.Any])
    
    inline def F1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F1")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F2")
    @js.native
    def F2: String = js.native
    inline def F2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F2")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F3")
    @js.native
    def F3: String = js.native
    inline def F3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F3")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F4")
    @js.native
    def F4: String = js.native
    inline def F4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F4")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F5")
    @js.native
    def F5: String = js.native
    inline def F5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F5")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F6")
    @js.native
    def F6: String = js.native
    inline def F6_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F6")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F7")
    @js.native
    def F7: String = js.native
    inline def F7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F7")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F8")
    @js.native
    def F8: String = js.native
    inline def F8_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F8")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.F9")
    @js.native
    def F9: String = js.native
    inline def F9_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("F9")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Help")
    @js.native
    def Help: String = js.native
    inline def Help_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Help")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Home")
    @js.native
    def Home: String = js.native
    inline def Home_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Home")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Insert")
    @js.native
    def Insert: String = js.native
    inline def Insert_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Insert")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Left arrow")
    @js.native
    def LeftArrow: String = js.native
    
    inline def LeftArrow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Left arrow")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Meta")
    @js.native
    def Meta: String = js.native
    inline def Meta_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Meta")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Multiply")
    @js.native
    def Multiply: String = js.native
    inline def Multiply_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Multiply")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.NULL")
    @js.native
    def NULL: String = js.native
    inline def NULL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 0")
    @js.native
    def Numpad0: String = js.native
    
    inline def Numpad0_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numpad 0")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 1")
    @js.native
    def Numpad1: String = js.native
    
    inline def Numpad1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numpad 1")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 2")
    @js.native
    def Numpad2: String = js.native
    
    inline def Numpad2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numpad 2")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 3")
    @js.native
    def Numpad3: String = js.native
    
    inline def Numpad3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numpad 3")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 4")
    @js.native
    def Numpad4: String = js.native
    
    inline def Numpad4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numpad 4")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 5")
    @js.native
    def Numpad5: String = js.native
    
    inline def Numpad5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numpad 5")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 6")
    @js.native
    def Numpad6: String = js.native
    
    inline def Numpad6_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numpad 6")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 7")
    @js.native
    def Numpad7: String = js.native
    
    inline def Numpad7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numpad 7")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 8")
    @js.native
    def Numpad8: String = js.native
    
    inline def Numpad8_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numpad 8")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Numpad 9")
    @js.native
    def Numpad9: String = js.native
    
    inline def Numpad9_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Numpad 9")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.PageDown")
    @js.native
    def PageDown_ : String = js.native
    
    inline def PageDown__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PageDown")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.PageUp")
    @js.native
    def PageUp_ : String = js.native
    
    inline def PageUp__=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PageUp")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Page_Down")
    @js.native
    def Page_Down: String = js.native
    inline def Page_Down_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Page_Down")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Page_Up")
    @js.native
    def Page_Up: String = js.native
    inline def Page_Up_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Page_Up")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Pagedown")
    @js.native
    def Pagedown: String = js.native
    inline def Pagedown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pagedown")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Pageup")
    @js.native
    def Pageup: String = js.native
    inline def Pageup_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pageup")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Pause")
    @js.native
    def Pause: String = js.native
    inline def Pause_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pause")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Return")
    @js.native
    def Return: String = js.native
    inline def Return_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Return")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Right arrow")
    @js.native
    def RightArrow: String = js.native
    
    inline def RightArrow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Right arrow")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Semicolon")
    @js.native
    def Semicolon: String = js.native
    inline def Semicolon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Semicolon")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Separator")
    @js.native
    def Separator: String = js.native
    inline def Separator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Separator")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Shift")
    @js.native
    def Shift: String = js.native
    inline def Shift_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shift")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Space")
    @js.native
    def Space: String = js.native
    inline def Space_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Space")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Subtract")
    @js.native
    def Subtract: String = js.native
    inline def Subtract_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Subtract")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Tab")
    @js.native
    def Tab: String = js.native
    inline def Tab_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Unidentified")
    @js.native
    def Unidentified: String = js.native
    inline def Unidentified_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unidentified")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Up arrow")
    @js.native
    def UpArrow: String = js.native
    
    inline def UpArrow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Up arrow")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.ZenkakuHankaku")
    @js.native
    def ZenkakuHankaku: String = js.native
    inline def ZenkakuHankaku_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZenkakuHankaku")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS.Zenkaku_Hankaku")
    @js.native
    def Zenkaku_Hankaku: String = js.native
    inline def Zenkaku_Hankaku_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Zenkaku_Hankaku")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/utils", "UNICODE_CHARACTERS. ")
    @js.native
    def _empty: String = js.native
    
    inline def _empty_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic(" ")(x.asInstanceOf[js.Any])
  }
  
  inline def canAccess(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canAccess")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def capabilitiesEnvironmentDetector(capabilities: Capabilities, automationProtocol: String): IsAndroid = (^.asInstanceOf[js.Dynamic].applyDynamic("capabilitiesEnvironmentDetector")(capabilities.asInstanceOf[js.Any], automationProtocol.asInstanceOf[js.Any])).asInstanceOf[IsAndroid]
  
  inline def commandCallStructure(commandName: String, args: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("commandCallStructure")(commandName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def devtoolsEnvironmentDetector(hasBrowserName: Capabilities): IsDevTools = ^.asInstanceOf[js.Dynamic].applyDynamic("devtoolsEnvironmentDetector")(hasBrowserName.asInstanceOf[js.Any]).asInstanceOf[IsDevTools]
  
  /**
    * execute test or hook asynchronously
    *
    * @param  {Function} fn         spec or hook method
    * @param  {object}   retries    { limit: number, attempts: number }
    * @param  {Array}    args       arguments passed to hook
    * @return {Promise}             that gets resolved once test/hook is done or was retried enough
    */
  inline def executeAsync(fn: js.Function, retries: Retries): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAsync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def executeAsync(fn: js.Function, retries: Retries, args: js.Array[Any]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAsync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  @JSImport("@wdio/utils", "executeHooksWithArgs")
  @js.native
  def executeHooksWithArgs: js.Function3[
    /* hookName */ String, 
    /* hooks */ js.UndefOr[js.Function | js.Array[js.Function]], 
    /* args */ js.UndefOr[js.Array[Any]], 
    js.Promise[js.Array[js.Error | Any]]
  ] = js.native
  inline def executeHooksWithArgs_=(
    x: js.Function3[
      /* hookName */ String, 
      /* hooks */ js.UndefOr[js.Function | js.Array[js.Function]], 
      /* args */ js.UndefOr[js.Array[Any]], 
      js.Promise[js.Array[js.Error | Any]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("executeHooksWithArgs")(x.asInstanceOf[js.Any])
  
  /**
    * execute test or hook synchronously
    *
    * @param  {Function} fn         spec or hook method
    * @param  {Number}   retries    { limit: number, attempts: number }
    * @param  {Array}    args       arguments passed to hook
    * @return {Promise}             that gets resolved once test/hook is done or was retried enough
    */
  /* was `typeof executeSyncFn` */
  inline def executeSync(fn: js.Function, retries: Retries): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def executeSync(fn: js.Function, retries: Retries, args: js.Array[Any]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSync")(fn.asInstanceOf[js.Any], retries.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def getArgumentType(arg: Any): string | number | bigint | boolean | symbol | undefined | `object` | function | `null` = ^.asInstanceOf[js.Dynamic].applyDynamic("getArgumentType")(arg.asInstanceOf[js.Any]).asInstanceOf[string | number | bigint | boolean | symbol | undefined | `object` | function | `null`]
  
  @JSImport("@wdio/utils", "hasWdioSyncSupport")
  @js.native
  def hasWdioSyncSupport: Boolean = js.native
  inline def hasWdioSyncSupport_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasWdioSyncSupport")(x.asInstanceOf[js.Any])
  
  inline def initialiseLauncherService(config: OmitTestrunnercapabilitie, caps: DesiredCapabilities): IgnoredWorkerServices = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseLauncherService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any])).asInstanceOf[IgnoredWorkerServices]
  
  inline def initialisePlugin(name: String): ServicePlugin | RunnerPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("initialisePlugin")(name.asInstanceOf[js.Any]).asInstanceOf[ServicePlugin | RunnerPlugin]
  inline def initialisePlugin(name: String, `type`: String): ServicePlugin | RunnerPlugin = (^.asInstanceOf[js.Dynamic].applyDynamic("initialisePlugin")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[ServicePlugin | RunnerPlugin]
  
  inline def initialiseWorkerService(config: Testrunner, caps: DesiredCapabilities): js.Array[ServiceInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseWorkerService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any])).asInstanceOf[js.Array[ServiceInstance]]
  inline def initialiseWorkerService(config: Testrunner, caps: DesiredCapabilities, ignoredWorkerServices: js.Array[String]): js.Array[ServiceInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("initialiseWorkerService")(config.asInstanceOf[js.Any], caps.asInstanceOf[js.Any], ignoredWorkerServices.asInstanceOf[js.Any])).asInstanceOf[js.Array[ServiceInstance]]
  
  inline def isFunctionAsync(fn: js.Function): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidParameter(arg: Any, expectedType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidParameter")(arg.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isW3C(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isW3C")().asInstanceOf[Boolean]
  inline def isW3C(capabilities: DesiredCapabilities): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isW3C")(capabilities.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@wdio/utils", "runFnInFiberContext")
  @js.native
  def runFnInFiberContext: js.Function1[
    /* fn */ js.Function, 
    js.ThisFunction1[/* this */ Any, /* repeated */ Any, js.Promise[Any]]
  ] = js.native
  inline def runFnInFiberContext_=(
    x: js.Function1[
      /* fn */ js.Function, 
      js.ThisFunction1[/* this */ Any, /* repeated */ Any, js.Promise[Any]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runFnInFiberContext")(x.asInstanceOf[js.Any])
  
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Array[js.Function],
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Array[js.Function],
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Array[js.Function],
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Array[js.Function],
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String,
    scope: /* globalThis */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Array[js.Function],
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Array[js.Function],
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String,
    scope: /* globalThis */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Array[js.Function],
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Array[js.Function],
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String,
    scope: /* globalThis */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def runTestInFiberContext(
    isSpec: Boolean,
    beforeFn: js.Function,
    beforeArgsFn: HookFnArgs[Any],
    afterFn: js.Function,
    afterArgsFn: HookFnArgs[Any],
    fnName: String,
    cid: String,
    scope: /* globalThis */ Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runTestInFiberContext")(isSpec.asInstanceOf[js.Any], beforeFn.asInstanceOf[js.Any], beforeArgsFn.asInstanceOf[js.Any], afterFn.asInstanceOf[js.Any], afterArgsFn.asInstanceOf[js.Any], fnName.asInstanceOf[js.Any], cid.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def safeRequire(name: String): ServicePlugin | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("safeRequire")(name.asInstanceOf[js.Any]).asInstanceOf[ServicePlugin | Null]
  
  inline def sessionEnvironmentDetector(hasCapabilitiesRequestedCapabilities: typings.wdioUtils.anon.Capabilities): IsChrome = ^.asInstanceOf[js.Dynamic].applyDynamic("sessionEnvironmentDetector")(hasCapabilitiesRequestedCapabilities.asInstanceOf[js.Any]).asInstanceOf[IsChrome]
  
  inline def sleep(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")().asInstanceOf[js.Promise[Any]]
  inline def sleep(ms: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def testFnWrapper(
    args_0: String,
    args_1: SpecFunction,
    args_2: BeforeHookParam[Any],
    args_3: AfterHookParam[Any],
    args_4: String,
    args_5: Double
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("testFnWrapper")(args_0.asInstanceOf[js.Any], args_1.asInstanceOf[js.Any], args_2.asInstanceOf[js.Any], args_3.asInstanceOf[js.Any], args_4.asInstanceOf[js.Any], args_5.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def transformCommandLogResult(result: File): `QuotationmarkLessthansignScreenshot[base64]GreaterthansignQuotationmark` | `QuotationmarkLessthansignScript[base64]GreaterthansignQuotationmark` | File = ^.asInstanceOf[js.Dynamic].applyDynamic("transformCommandLogResult")(result.asInstanceOf[js.Any]).asInstanceOf[`QuotationmarkLessthansignScreenshot[base64]GreaterthansignQuotationmark` | `QuotationmarkLessthansignScript[base64]GreaterthansignQuotationmark` | File]
  
  inline def webdriverMonad(options: Record[String, Any]): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("webdriverMonad")(options.asInstanceOf[js.Any]).asInstanceOf[Call]
  inline def webdriverMonad(options: Record[String, Any], modifier: js.Function): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("webdriverMonad")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Call]
  inline def webdriverMonad(options: Record[String, Any], modifier: js.Function, propertiesObject: PropertiesObject): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("webdriverMonad")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], propertiesObject.asInstanceOf[js.Any])).asInstanceOf[Call]
  inline def webdriverMonad(options: Record[String, Any], modifier: Unit, propertiesObject: PropertiesObject): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("webdriverMonad")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], propertiesObject.asInstanceOf[js.Any])).asInstanceOf[Call]
  
  /**
    * wrap command to enable before and after command to be executed
    * @param commandName name of the command (e.g. getTitle)
    * @param fn          command function
    */
  @JSImport("@wdio/utils", "wrapCommand")
  @js.native
  def wrapCommand: js.Function2[
    /* commandName */ String, 
    /* fn */ js.Function, 
    js.Function1[/* args */ Any, js.Promise[Any]]
  ] = js.native
  inline def wrapCommand_=(
    x: js.Function2[
      /* commandName */ String, 
      /* fn */ js.Function, 
      js.Function1[/* args */ Any, js.Promise[Any]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapCommand")(x.asInstanceOf[js.Any])
}
