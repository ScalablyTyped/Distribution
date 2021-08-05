package typings.unidriverCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: String
    
    var key: String
    
    var keyCode: Double
  }
  object Code {
    
    inline def apply(code: String, key: String, keyCode: Double): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait CodeKey extends StObject {
    
    var code: String
    
    var key: String
  }
  object CodeKey {
    
    inline def apply(code: String, key: String): CodeKey = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeKey]
    }
    
    extension [Self <: CodeKey](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait CodeKeyKeyCode extends StObject {
    
    var code: String
    
    var key: String
    
    var keyCode: Double
    
    var location: Double
  }
  object CodeKeyKeyCode {
    
    inline def apply(code: String, key: String, keyCode: Double, location: Double): CodeKeyKeyCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeKeyKeyCode]
    }
    
    extension [Self <: CodeKeyKeyCode](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var keyCode: Double
  }
  object Key {
    
    inline def apply(key: String, keyCode: Double): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyCode extends StObject {
    
    var code: String
    
    var key: String
    
    var keyCode: Double
  }
  object KeyCode {
    
    inline def apply(code: String, key: String, keyCode: Double): KeyCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyCode]
    }
    
    extension [Self <: KeyCode](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyCodeLocation extends StObject {
    
    var code: String
    
    var key: String
    
    var keyCode: Double
    
    var location: Double
  }
  object KeyCodeLocation {
    
    inline def apply(code: String, key: String, keyCode: Double, location: Double): KeyCodeLocation = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyCodeLocation]
    }
    
    extension [Self <: KeyCodeLocation](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyCodeShiftKey extends StObject {
    
    var code: String
    
    var key: String
    
    var keyCode: Double
    
    var shiftKey: String
  }
  object KeyCodeShiftKey {
    
    inline def apply(code: String, key: String, keyCode: Double, shiftKey: String): KeyCodeShiftKey = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyCodeShiftKey]
    }
    
    extension [Self <: KeyCodeShiftKey](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: String): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyKeyCode extends StObject {
    
    var code: String
    
    var key: String
    
    var keyCode: Double
    
    var text: String
  }
  object KeyKeyCode {
    
    inline def apply(code: String, key: String, keyCode: Double, text: String): KeyKeyCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyKeyCode]
    }
    
    extension [Self <: KeyKeyCode](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyString extends StObject {
    
    var key: String
    
    var keyCode: Double
  }
  object KeyString {
    
    inline def apply(key: String, keyCode: Double): KeyString = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyString]
    }
    
    extension [Self <: KeyString](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location extends StObject {
    
    var code: String
    
    var key: String
    
    var keyCode: Double
    
    var location: Double
    
    var shiftKey: String
    
    var shiftKeyCode: Double
  }
  object Location {
    
    inline def apply(
      code: String,
      key: String,
      keyCode: Double,
      location: Double,
      shiftKey: String,
      shiftKeyCode: Double
    ): Location = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], shiftKeyCode = shiftKeyCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: String): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKeyCode(value: Double): Self = StObject.set(x, "shiftKeyCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShiftKey extends StObject {
    
    var code: String
    
    var key: String
    
    var keyCode: Double
    
    var location: Double
    
    var shiftKey: String
    
    var shiftKeyCode: Double
  }
  object ShiftKey {
    
    inline def apply(
      code: String,
      key: String,
      keyCode: Double,
      location: Double,
      shiftKey: String,
      shiftKeyCode: Double
    ): ShiftKey = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], shiftKeyCode = shiftKeyCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShiftKey]
    }
    
    extension [Self <: ShiftKey](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: String): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKeyCode(value: Double): Self = StObject.set(x, "shiftKeyCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var code: String
    
    var key: String
    
    var keyCode: Double
    
    var location: Double
    
    var text: String
  }
  object Text {
    
    inline def apply(code: String, key: String, keyCode: Double, location: Double, text: String): Text = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait _empty
    extends StObject
       with Code {
    
    @JSName("$")
    var $: Code = js.native
    
    var `0`: Code = js.native
    
    var `1`: Code = js.native
    
    var `2`: Code = js.native
    
    var `3`: Code = js.native
    
    var `4`: Code = js.native
    
    var `5`: Code = js.native
    
    var `6`: Code = js.native
    
    var `7`: Code = js.native
    
    var `8`: Code = js.native
    
    var `9`: Code = js.native
    
    var `@`: Code = js.native
    
    var A: Code = js.native
    
    var Abort: KeyCode = js.native
    
    var Accept: KeyString = js.native
    
    var Alt: CodeKeyKeyCode = js.native
    
    var AltGraph: KeyCode = js.native
    
    var AltLeft: KeyCodeLocation = js.native
    
    var AltRight: KeyCodeLocation = js.native
    
    @JSName("&")
    var Ampersand: Code = js.native
    
    @JSName("'")
    var Apostrophe: Code = js.native
    
    var ArrowDown: KeyCode = js.native
    
    var ArrowLeft: KeyCode = js.native
    
    var ArrowRight: KeyCode = js.native
    
    var ArrowUp: KeyCode = js.native
    
    @JSName("*")
    var Asterisk: CodeKeyKeyCode = js.native
    
    var Attn: KeyString = js.native
    
    var AudioVolumeDown: KeyCode = js.native
    
    var AudioVolumeMute: KeyCode = js.native
    
    var AudioVolumeUp: KeyCode = js.native
    
    var B: Code = js.native
    
    var Backquote: KeyCodeShiftKey = js.native
    
    var Backslash: Code | KeyCodeShiftKey = js.native
    
    var Backspace: KeyCode = js.native
    
    var BracketLeft: KeyCodeShiftKey = js.native
    
    var BracketRight: KeyCodeShiftKey = js.native
    
    var C: Code = js.native
    
    var Cancel: Code = js.native
    
    var CapsLock: KeyCode = js.native
    
    @JSName("\r")
    var Carriagereturn: KeyKeyCode = js.native
    
    var Clear: CodeKeyKeyCode = js.native
    
    @JSName(":")
    var Colon: Code = js.native
    
    var Comma: Code | KeyCodeShiftKey = js.native
    
    var ContextMenu: KeyCode = js.native
    
    var Control: CodeKeyKeyCode = js.native
    
    var ControlLeft: KeyCodeLocation = js.native
    
    var ControlRight: KeyCodeLocation = js.native
    
    var Convert: KeyCode = js.native
    
    var CrSel: Code = js.native
    
    var D: Code = js.native
    
    var Delete: KeyCode = js.native
    
    var Digit0: KeyCodeShiftKey = js.native
    
    var Digit1: KeyCodeShiftKey = js.native
    
    var Digit2: KeyCodeShiftKey = js.native
    
    var Digit3: KeyCodeShiftKey = js.native
    
    var Digit4: KeyCodeShiftKey = js.native
    
    var Digit5: KeyCodeShiftKey = js.native
    
    var Digit6: KeyCodeShiftKey = js.native
    
    var Digit7: KeyCodeShiftKey = js.native
    
    var Digit8: KeyCodeShiftKey = js.native
    
    var Digit9: KeyCodeShiftKey = js.native
    
    @JSName(".")
    var Dot: Code = js.native
    
    var E: Code = js.native
    
    var Eject: CodeKey = js.native
    
    var End: KeyCode = js.native
    
    var Enter: KeyKeyCode = js.native
    
    var Equal: KeyCodeShiftKey = js.native
    
    @JSName("=")
    var Equalssign: Code = js.native
    
    var EraseEof: KeyString = js.native
    
    var Escape: KeyCode = js.native
    
    var ExSel: KeyString = js.native
    
    @JSName("!")
    var Exclamationmark: Code = js.native
    
    var Execute: Code = js.native
    
    var F: Code = js.native
    
    var F1: KeyCode = js.native
    
    var F10: KeyCode = js.native
    
    var F11: KeyCode = js.native
    
    var F12: KeyCode = js.native
    
    var F13: KeyCode = js.native
    
    var F14: KeyCode = js.native
    
    var F15: KeyCode = js.native
    
    var F16: KeyCode = js.native
    
    var F17: KeyCode = js.native
    
    var F18: KeyCode = js.native
    
    var F19: KeyCode = js.native
    
    var F2: KeyCode = js.native
    
    var F20: KeyCode = js.native
    
    var F21: KeyCode = js.native
    
    var F22: KeyCode = js.native
    
    var F23: KeyCode = js.native
    
    var F24: KeyCode = js.native
    
    var F3: KeyCode = js.native
    
    var F4: KeyCode = js.native
    
    var F5: KeyCode = js.native
    
    var F6: KeyCode = js.native
    
    var F7: KeyCode = js.native
    
    var F8: KeyCode = js.native
    
    var F9: KeyCode = js.native
    
    var G: Code = js.native
    
    @JSName("`")
    var Graveaccent: Code = js.native
    
    @JSName(">")
    var Greaterthansign: Code = js.native
    
    var H: Code = js.native
    
    var Help: KeyCode = js.native
    
    var Home: KeyCode = js.native
    
    var I: Code = js.native
    
    var Insert: KeyCode = js.native
    
    var J: Code = js.native
    
    var K: Code = js.native
    
    var KeyA: KeyCodeShiftKey = js.native
    
    var KeyB: KeyCodeShiftKey = js.native
    
    var KeyC: KeyCodeShiftKey = js.native
    
    var KeyD: KeyCodeShiftKey = js.native
    
    var KeyE: KeyCodeShiftKey = js.native
    
    var KeyF: KeyCodeShiftKey = js.native
    
    var KeyG: KeyCodeShiftKey = js.native
    
    var KeyH: KeyCodeShiftKey = js.native
    
    var KeyI: KeyCodeShiftKey = js.native
    
    var KeyJ: KeyCodeShiftKey = js.native
    
    var KeyK: KeyCodeShiftKey = js.native
    
    var KeyL: KeyCodeShiftKey = js.native
    
    var KeyM: KeyCodeShiftKey = js.native
    
    var KeyN: KeyCodeShiftKey = js.native
    
    var KeyO: KeyCodeShiftKey = js.native
    
    var KeyP: KeyCodeShiftKey = js.native
    
    var KeyQ: KeyCodeShiftKey = js.native
    
    var KeyR: KeyCodeShiftKey = js.native
    
    var KeyS: KeyCodeShiftKey = js.native
    
    var KeyT: KeyCodeShiftKey = js.native
    
    var KeyU: KeyCodeShiftKey = js.native
    
    var KeyV: KeyCodeShiftKey = js.native
    
    var KeyW: KeyCodeShiftKey = js.native
    
    var KeyX: KeyCodeShiftKey = js.native
    
    var KeyY: KeyCodeShiftKey = js.native
    
    var KeyZ: KeyCodeShiftKey = js.native
    
    var L: Code = js.native
    
    @JSName("{")
    var Leftcurlybracket: Code = js.native
    
    @JSName("(")
    var Leftparenthesis: Code = js.native
    
    @JSName("<")
    var Lessthansign: Code = js.native
    
    @JSName("\n")
    var Linefeed: KeyKeyCode = js.native
    
    var M: Code = js.native
    
    var MediaPlayPause: KeyCode = js.native
    
    var MediaStop: KeyCode = js.native
    
    var MediaTrackNext: KeyCode = js.native
    
    var MediaTrackPrevious: KeyCode = js.native
    
    var Meta: CodeKeyKeyCode = js.native
    
    var MetaLeft: KeyCodeLocation = js.native
    
    var MetaRight: KeyCodeLocation = js.native
    
    var Minus: KeyCodeShiftKey = js.native
    
    var ModeChange: KeyString = js.native
    
    var N: Code = js.native
    
    var NonConvert: KeyCode = js.native
    
    @JSName("\u0000")
    var Null: CodeKeyKeyCode = js.native
    
    var NumLock: KeyCode = js.native
    
    var Numpad0: Location = js.native
    
    var Numpad1: Location = js.native
    
    var Numpad2: Location = js.native
    
    var Numpad3: Location = js.native
    
    var Numpad4: Location = js.native
    
    var Numpad5: Location = js.native
    
    var Numpad6: Location = js.native
    
    var Numpad7: Location = js.native
    
    var Numpad8: Location = js.native
    
    var Numpad9: Location = js.native
    
    var NumpadAdd: KeyCodeLocation = js.native
    
    var NumpadDecimal: ShiftKey = js.native
    
    var NumpadDivide: KeyCodeLocation = js.native
    
    var NumpadEnter: Text = js.native
    
    var NumpadEqual: KeyCodeLocation = js.native
    
    var NumpadMultiply: KeyCodeLocation = js.native
    
    var NumpadSubtract: KeyCodeLocation = js.native
    
    var O: Code = js.native
    
    var Open: KeyCode = js.native
    
    var P: Code = js.native
    
    var PageDown: KeyCode = js.native
    
    var PageUp: KeyCode = js.native
    
    var Pause: KeyCode = js.native
    
    @JSName("%")
    var Percentsign: Code = js.native
    
    var Period: KeyCodeShiftKey = js.native
    
    var Play: KeyString = js.native
    
    @JSName("+")
    var Plussign: CodeKeyKeyCode = js.native
    
    var Power: CodeKey = js.native
    
    var Print: KeyString = js.native
    
    var PrintScreen: KeyCode = js.native
    
    var Props: KeyCode = js.native
    
    var Q: Code = js.native
    
    @JSName("?")
    var Questionmark: Code = js.native
    
    @JSName("\"")
    var Quotationmark: Code = js.native
    
    var Quote: KeyCodeShiftKey = js.native
    
    var R: Code = js.native
    
    @JSName("}")
    var Rightcurlybracket: Code = js.native
    
    @JSName(")")
    var Rightparenthesis: Code = js.native
    
    var S: Code = js.native
    
    var ScrollLock: KeyCode = js.native
    
    var Select: KeyCode = js.native
    
    var Semicolon: Code | KeyCodeShiftKey = js.native
    
    var Shift: CodeKeyKeyCode = js.native
    
    var ShiftLeft: KeyCodeLocation = js.native
    
    var ShiftRight: KeyCodeLocation = js.native
    
    var Slash: CodeKeyKeyCode | KeyCodeShiftKey = js.native
    
    var Space: Code | KeyCode = js.native
    
    var T: Code = js.native
    
    var Tab: KeyCode = js.native
    
    @JSName("~")
    var Tilde: Code = js.native
    
    var U: Code = js.native
    
    var V: Code = js.native
    
    @JSName("|")
    var Verticalline: Code = js.native
    
    var W: Code = js.native
    
    var X: Code = js.native
    
    var Y: Code = js.native
    
    var Z: Code = js.native
    
    var ZoomOut: KeyString = js.native
    
    var `[`: Code = js.native
    
    var `]`: Code = js.native
    
    @JSName("-")
    var _dash: CodeKeyKeyCode = js.native
    
    /* private */ @JSName("")
    var _empty: Code = js.native
    
    @JSName("_")
    var _underscore: Code = js.native
    
    var a: Code = js.native
    
    var b: Code = js.native
    
    var c: Code = js.native
    
    var d: Code = js.native
    
    var e: Code = js.native
    
    var f: Code = js.native
    
    var g: Code = js.native
    
    var h: Code = js.native
    
    var i: Code = js.native
    
    var j: Code = js.native
    
    var k: Code = js.native
    
    var l: Code = js.native
    
    var m: Code = js.native
    
    var n: Code = js.native
    
    var o: Code = js.native
    
    var p: Code = js.native
    
    var q: Code = js.native
    
    var r: Code = js.native
    
    var s: Code = js.native
    
    var t: Code = js.native
    
    var u: Code = js.native
    
    var v: Code = js.native
    
    var w: Code = js.native
    
    var x: Code = js.native
    
    var y: Code = js.native
    
    var z: Code = js.native
  }
}
