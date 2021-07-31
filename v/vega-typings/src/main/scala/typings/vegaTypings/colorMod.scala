package typings.vegaTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  type Color = ColorName | HexColor | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.black
    - typings.vegaTypings.vegaTypingsStrings.silver
    - typings.vegaTypings.vegaTypingsStrings.gray
    - typings.vegaTypings.vegaTypingsStrings.white
    - typings.vegaTypings.vegaTypingsStrings.maroon
    - typings.vegaTypings.vegaTypingsStrings.red
    - typings.vegaTypings.vegaTypingsStrings.purple
    - typings.vegaTypings.vegaTypingsStrings.fuchsia
    - typings.vegaTypings.vegaTypingsStrings.green
    - typings.vegaTypings.vegaTypingsStrings.lime
    - typings.vegaTypings.vegaTypingsStrings.olive
    - typings.vegaTypings.vegaTypingsStrings.yellow
    - typings.vegaTypings.vegaTypingsStrings.navy
    - typings.vegaTypings.vegaTypingsStrings.blue
    - typings.vegaTypings.vegaTypingsStrings.teal
    - typings.vegaTypings.vegaTypingsStrings.aqua
    - typings.vegaTypings.vegaTypingsStrings.orange
    - typings.vegaTypings.vegaTypingsStrings.aliceblue
    - typings.vegaTypings.vegaTypingsStrings.antiquewhite
    - typings.vegaTypings.vegaTypingsStrings.aquamarine
    - typings.vegaTypings.vegaTypingsStrings.azure
    - typings.vegaTypings.vegaTypingsStrings.beige
    - typings.vegaTypings.vegaTypingsStrings.bisque
    - typings.vegaTypings.vegaTypingsStrings.blanchedalmond
    - typings.vegaTypings.vegaTypingsStrings.blueviolet
    - typings.vegaTypings.vegaTypingsStrings.brown
    - typings.vegaTypings.vegaTypingsStrings.burlywood
    - typings.vegaTypings.vegaTypingsStrings.cadetblue
    - typings.vegaTypings.vegaTypingsStrings.chartreuse
    - typings.vegaTypings.vegaTypingsStrings.chocolate
    - typings.vegaTypings.vegaTypingsStrings.coral
    - typings.vegaTypings.vegaTypingsStrings.cornflowerblue
    - typings.vegaTypings.vegaTypingsStrings.cornsilk
    - typings.vegaTypings.vegaTypingsStrings.crimson
    - typings.vegaTypings.vegaTypingsStrings.cyan
    - typings.vegaTypings.vegaTypingsStrings.darkblue
    - typings.vegaTypings.vegaTypingsStrings.darkcyan
    - typings.vegaTypings.vegaTypingsStrings.darkgoldenrod
    - typings.vegaTypings.vegaTypingsStrings.darkgray
    - typings.vegaTypings.vegaTypingsStrings.darkgreen
    - typings.vegaTypings.vegaTypingsStrings.darkgrey
    - typings.vegaTypings.vegaTypingsStrings.darkkhaki
    - typings.vegaTypings.vegaTypingsStrings.darkmagenta
    - typings.vegaTypings.vegaTypingsStrings.darkolivegreen
    - typings.vegaTypings.vegaTypingsStrings.darkorange
    - typings.vegaTypings.vegaTypingsStrings.darkorchid
    - typings.vegaTypings.vegaTypingsStrings.darkred
    - typings.vegaTypings.vegaTypingsStrings.darksalmon
    - typings.vegaTypings.vegaTypingsStrings.darkseagreen
    - typings.vegaTypings.vegaTypingsStrings.darkslateblue
    - typings.vegaTypings.vegaTypingsStrings.darkslategray
    - typings.vegaTypings.vegaTypingsStrings.darkslategrey
    - typings.vegaTypings.vegaTypingsStrings.darkturquoise
    - typings.vegaTypings.vegaTypingsStrings.darkviolet
    - typings.vegaTypings.vegaTypingsStrings.deeppink
    - typings.vegaTypings.vegaTypingsStrings.deepskyblue
    - typings.vegaTypings.vegaTypingsStrings.dimgray
    - typings.vegaTypings.vegaTypingsStrings.dimgrey
    - typings.vegaTypings.vegaTypingsStrings.dodgerblue
    - typings.vegaTypings.vegaTypingsStrings.firebrick
    - typings.vegaTypings.vegaTypingsStrings.floralwhite
    - typings.vegaTypings.vegaTypingsStrings.forestgreen
    - typings.vegaTypings.vegaTypingsStrings.gainsboro
    - typings.vegaTypings.vegaTypingsStrings.ghostwhite
    - typings.vegaTypings.vegaTypingsStrings.gold
    - typings.vegaTypings.vegaTypingsStrings.goldenrod
    - typings.vegaTypings.vegaTypingsStrings.greenyellow
    - typings.vegaTypings.vegaTypingsStrings.grey
    - typings.vegaTypings.vegaTypingsStrings.honeydew
    - typings.vegaTypings.vegaTypingsStrings.hotpink
    - typings.vegaTypings.vegaTypingsStrings.indianred
    - typings.vegaTypings.vegaTypingsStrings.indigo
    - typings.vegaTypings.vegaTypingsStrings.ivory
    - typings.vegaTypings.vegaTypingsStrings.khaki
    - typings.vegaTypings.vegaTypingsStrings.lavender
    - typings.vegaTypings.vegaTypingsStrings.lavenderblush
    - typings.vegaTypings.vegaTypingsStrings.lawngreen
    - typings.vegaTypings.vegaTypingsStrings.lemonchiffon
    - typings.vegaTypings.vegaTypingsStrings.lightblue
    - typings.vegaTypings.vegaTypingsStrings.lightcoral
    - typings.vegaTypings.vegaTypingsStrings.lightcyan
    - typings.vegaTypings.vegaTypingsStrings.lightgoldenrodyellow
    - typings.vegaTypings.vegaTypingsStrings.lightgray
    - typings.vegaTypings.vegaTypingsStrings.lightgreen
    - typings.vegaTypings.vegaTypingsStrings.lightgrey
    - typings.vegaTypings.vegaTypingsStrings.lightpink
    - typings.vegaTypings.vegaTypingsStrings.lightsalmon
    - typings.vegaTypings.vegaTypingsStrings.lightseagreen
    - typings.vegaTypings.vegaTypingsStrings.lightskyblue
    - typings.vegaTypings.vegaTypingsStrings.lightslategray
    - typings.vegaTypings.vegaTypingsStrings.lightslategrey
    - typings.vegaTypings.vegaTypingsStrings.lightsteelblue
    - typings.vegaTypings.vegaTypingsStrings.lightyellow
    - typings.vegaTypings.vegaTypingsStrings.limegreen
    - typings.vegaTypings.vegaTypingsStrings.linen
    - typings.vegaTypings.vegaTypingsStrings.magenta
    - typings.vegaTypings.vegaTypingsStrings.mediumaquamarine
    - typings.vegaTypings.vegaTypingsStrings.mediumblue
    - typings.vegaTypings.vegaTypingsStrings.mediumorchid
    - typings.vegaTypings.vegaTypingsStrings.mediumpurple
    - typings.vegaTypings.vegaTypingsStrings.mediumseagreen
    - typings.vegaTypings.vegaTypingsStrings.mediumslateblue
    - typings.vegaTypings.vegaTypingsStrings.mediumspringgreen
    - typings.vegaTypings.vegaTypingsStrings.mediumturquoise
    - typings.vegaTypings.vegaTypingsStrings.mediumvioletred
    - typings.vegaTypings.vegaTypingsStrings.midnightblue
    - typings.vegaTypings.vegaTypingsStrings.mintcream
    - typings.vegaTypings.vegaTypingsStrings.mistyrose
    - typings.vegaTypings.vegaTypingsStrings.moccasin
    - typings.vegaTypings.vegaTypingsStrings.navajowhite
    - typings.vegaTypings.vegaTypingsStrings.oldlace
    - typings.vegaTypings.vegaTypingsStrings.olivedrab
    - typings.vegaTypings.vegaTypingsStrings.orangered
    - typings.vegaTypings.vegaTypingsStrings.orchid
    - typings.vegaTypings.vegaTypingsStrings.palegoldenrod
    - typings.vegaTypings.vegaTypingsStrings.palegreen
    - typings.vegaTypings.vegaTypingsStrings.paleturquoise
    - typings.vegaTypings.vegaTypingsStrings.palevioletred
    - typings.vegaTypings.vegaTypingsStrings.papayawhip
    - typings.vegaTypings.vegaTypingsStrings.peachpuff
    - typings.vegaTypings.vegaTypingsStrings.peru
    - typings.vegaTypings.vegaTypingsStrings.pink
    - typings.vegaTypings.vegaTypingsStrings.plum
    - typings.vegaTypings.vegaTypingsStrings.powderblue
    - typings.vegaTypings.vegaTypingsStrings.rosybrown
    - typings.vegaTypings.vegaTypingsStrings.royalblue
    - typings.vegaTypings.vegaTypingsStrings.saddlebrown
    - typings.vegaTypings.vegaTypingsStrings.salmon
    - typings.vegaTypings.vegaTypingsStrings.sandybrown
    - typings.vegaTypings.vegaTypingsStrings.seagreen
    - typings.vegaTypings.vegaTypingsStrings.seashell
    - typings.vegaTypings.vegaTypingsStrings.sienna
    - typings.vegaTypings.vegaTypingsStrings.skyblue
    - typings.vegaTypings.vegaTypingsStrings.slateblue
    - typings.vegaTypings.vegaTypingsStrings.slategray
    - typings.vegaTypings.vegaTypingsStrings.slategrey
    - typings.vegaTypings.vegaTypingsStrings.snow
    - typings.vegaTypings.vegaTypingsStrings.springgreen
    - typings.vegaTypings.vegaTypingsStrings.steelblue
    - typings.vegaTypings.vegaTypingsStrings.tan
    - typings.vegaTypings.vegaTypingsStrings.thistle
    - typings.vegaTypings.vegaTypingsStrings.tomato
    - typings.vegaTypings.vegaTypingsStrings.turquoise
    - typings.vegaTypings.vegaTypingsStrings.violet
    - typings.vegaTypings.vegaTypingsStrings.wheat
    - typings.vegaTypings.vegaTypingsStrings.whitesmoke
    - typings.vegaTypings.vegaTypingsStrings.yellowgreen
    - typings.vegaTypings.vegaTypingsStrings.rebeccapurple
  */
  trait ColorName extends StObject
  object ColorName {
    
    @scala.inline
    def aliceblue: typings.vegaTypings.vegaTypingsStrings.aliceblue = "aliceblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.aliceblue]
    
    @scala.inline
    def antiquewhite: typings.vegaTypings.vegaTypingsStrings.antiquewhite = "antiquewhite".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.antiquewhite]
    
    @scala.inline
    def aqua: typings.vegaTypings.vegaTypingsStrings.aqua = "aqua".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.aqua]
    
    @scala.inline
    def aquamarine: typings.vegaTypings.vegaTypingsStrings.aquamarine = "aquamarine".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.aquamarine]
    
    @scala.inline
    def azure: typings.vegaTypings.vegaTypingsStrings.azure = "azure".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.azure]
    
    @scala.inline
    def beige: typings.vegaTypings.vegaTypingsStrings.beige = "beige".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.beige]
    
    @scala.inline
    def bisque: typings.vegaTypings.vegaTypingsStrings.bisque = "bisque".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.bisque]
    
    @scala.inline
    def black: typings.vegaTypings.vegaTypingsStrings.black = "black".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.black]
    
    @scala.inline
    def blanchedalmond: typings.vegaTypings.vegaTypingsStrings.blanchedalmond = "blanchedalmond".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.blanchedalmond]
    
    @scala.inline
    def blue: typings.vegaTypings.vegaTypingsStrings.blue = "blue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.blue]
    
    @scala.inline
    def blueviolet: typings.vegaTypings.vegaTypingsStrings.blueviolet = "blueviolet".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.blueviolet]
    
    @scala.inline
    def brown: typings.vegaTypings.vegaTypingsStrings.brown = "brown".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.brown]
    
    @scala.inline
    def burlywood: typings.vegaTypings.vegaTypingsStrings.burlywood = "burlywood".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.burlywood]
    
    @scala.inline
    def cadetblue: typings.vegaTypings.vegaTypingsStrings.cadetblue = "cadetblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.cadetblue]
    
    @scala.inline
    def chartreuse: typings.vegaTypings.vegaTypingsStrings.chartreuse = "chartreuse".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.chartreuse]
    
    @scala.inline
    def chocolate: typings.vegaTypings.vegaTypingsStrings.chocolate = "chocolate".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.chocolate]
    
    @scala.inline
    def coral: typings.vegaTypings.vegaTypingsStrings.coral = "coral".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.coral]
    
    @scala.inline
    def cornflowerblue: typings.vegaTypings.vegaTypingsStrings.cornflowerblue = "cornflowerblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.cornflowerblue]
    
    @scala.inline
    def cornsilk: typings.vegaTypings.vegaTypingsStrings.cornsilk = "cornsilk".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.cornsilk]
    
    @scala.inline
    def crimson: typings.vegaTypings.vegaTypingsStrings.crimson = "crimson".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.crimson]
    
    @scala.inline
    def cyan: typings.vegaTypings.vegaTypingsStrings.cyan = "cyan".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.cyan]
    
    @scala.inline
    def darkblue: typings.vegaTypings.vegaTypingsStrings.darkblue = "darkblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkblue]
    
    @scala.inline
    def darkcyan: typings.vegaTypings.vegaTypingsStrings.darkcyan = "darkcyan".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkcyan]
    
    @scala.inline
    def darkgoldenrod: typings.vegaTypings.vegaTypingsStrings.darkgoldenrod = "darkgoldenrod".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkgoldenrod]
    
    @scala.inline
    def darkgray: typings.vegaTypings.vegaTypingsStrings.darkgray = "darkgray".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkgray]
    
    @scala.inline
    def darkgreen: typings.vegaTypings.vegaTypingsStrings.darkgreen = "darkgreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkgreen]
    
    @scala.inline
    def darkgrey: typings.vegaTypings.vegaTypingsStrings.darkgrey = "darkgrey".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkgrey]
    
    @scala.inline
    def darkkhaki: typings.vegaTypings.vegaTypingsStrings.darkkhaki = "darkkhaki".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkkhaki]
    
    @scala.inline
    def darkmagenta: typings.vegaTypings.vegaTypingsStrings.darkmagenta = "darkmagenta".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkmagenta]
    
    @scala.inline
    def darkolivegreen: typings.vegaTypings.vegaTypingsStrings.darkolivegreen = "darkolivegreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkolivegreen]
    
    @scala.inline
    def darkorange: typings.vegaTypings.vegaTypingsStrings.darkorange = "darkorange".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkorange]
    
    @scala.inline
    def darkorchid: typings.vegaTypings.vegaTypingsStrings.darkorchid = "darkorchid".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkorchid]
    
    @scala.inline
    def darkred: typings.vegaTypings.vegaTypingsStrings.darkred = "darkred".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkred]
    
    @scala.inline
    def darksalmon: typings.vegaTypings.vegaTypingsStrings.darksalmon = "darksalmon".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darksalmon]
    
    @scala.inline
    def darkseagreen: typings.vegaTypings.vegaTypingsStrings.darkseagreen = "darkseagreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkseagreen]
    
    @scala.inline
    def darkslateblue: typings.vegaTypings.vegaTypingsStrings.darkslateblue = "darkslateblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkslateblue]
    
    @scala.inline
    def darkslategray: typings.vegaTypings.vegaTypingsStrings.darkslategray = "darkslategray".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkslategray]
    
    @scala.inline
    def darkslategrey: typings.vegaTypings.vegaTypingsStrings.darkslategrey = "darkslategrey".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkslategrey]
    
    @scala.inline
    def darkturquoise: typings.vegaTypings.vegaTypingsStrings.darkturquoise = "darkturquoise".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkturquoise]
    
    @scala.inline
    def darkviolet: typings.vegaTypings.vegaTypingsStrings.darkviolet = "darkviolet".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkviolet]
    
    @scala.inline
    def deeppink: typings.vegaTypings.vegaTypingsStrings.deeppink = "deeppink".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.deeppink]
    
    @scala.inline
    def deepskyblue: typings.vegaTypings.vegaTypingsStrings.deepskyblue = "deepskyblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.deepskyblue]
    
    @scala.inline
    def dimgray: typings.vegaTypings.vegaTypingsStrings.dimgray = "dimgray".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.dimgray]
    
    @scala.inline
    def dimgrey: typings.vegaTypings.vegaTypingsStrings.dimgrey = "dimgrey".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.dimgrey]
    
    @scala.inline
    def dodgerblue: typings.vegaTypings.vegaTypingsStrings.dodgerblue = "dodgerblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.dodgerblue]
    
    @scala.inline
    def firebrick: typings.vegaTypings.vegaTypingsStrings.firebrick = "firebrick".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.firebrick]
    
    @scala.inline
    def floralwhite: typings.vegaTypings.vegaTypingsStrings.floralwhite = "floralwhite".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.floralwhite]
    
    @scala.inline
    def forestgreen: typings.vegaTypings.vegaTypingsStrings.forestgreen = "forestgreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.forestgreen]
    
    @scala.inline
    def fuchsia: typings.vegaTypings.vegaTypingsStrings.fuchsia = "fuchsia".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.fuchsia]
    
    @scala.inline
    def gainsboro: typings.vegaTypings.vegaTypingsStrings.gainsboro = "gainsboro".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.gainsboro]
    
    @scala.inline
    def ghostwhite: typings.vegaTypings.vegaTypingsStrings.ghostwhite = "ghostwhite".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.ghostwhite]
    
    @scala.inline
    def gold: typings.vegaTypings.vegaTypingsStrings.gold = "gold".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.gold]
    
    @scala.inline
    def goldenrod: typings.vegaTypings.vegaTypingsStrings.goldenrod = "goldenrod".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.goldenrod]
    
    @scala.inline
    def gray: typings.vegaTypings.vegaTypingsStrings.gray = "gray".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.gray]
    
    @scala.inline
    def green: typings.vegaTypings.vegaTypingsStrings.green = "green".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.green]
    
    @scala.inline
    def greenyellow: typings.vegaTypings.vegaTypingsStrings.greenyellow = "greenyellow".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.greenyellow]
    
    @scala.inline
    def grey: typings.vegaTypings.vegaTypingsStrings.grey = "grey".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.grey]
    
    @scala.inline
    def honeydew: typings.vegaTypings.vegaTypingsStrings.honeydew = "honeydew".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.honeydew]
    
    @scala.inline
    def hotpink: typings.vegaTypings.vegaTypingsStrings.hotpink = "hotpink".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.hotpink]
    
    @scala.inline
    def indianred: typings.vegaTypings.vegaTypingsStrings.indianred = "indianred".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.indianred]
    
    @scala.inline
    def indigo: typings.vegaTypings.vegaTypingsStrings.indigo = "indigo".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.indigo]
    
    @scala.inline
    def ivory: typings.vegaTypings.vegaTypingsStrings.ivory = "ivory".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.ivory]
    
    @scala.inline
    def khaki: typings.vegaTypings.vegaTypingsStrings.khaki = "khaki".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.khaki]
    
    @scala.inline
    def lavender: typings.vegaTypings.vegaTypingsStrings.lavender = "lavender".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lavender]
    
    @scala.inline
    def lavenderblush: typings.vegaTypings.vegaTypingsStrings.lavenderblush = "lavenderblush".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lavenderblush]
    
    @scala.inline
    def lawngreen: typings.vegaTypings.vegaTypingsStrings.lawngreen = "lawngreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lawngreen]
    
    @scala.inline
    def lemonchiffon: typings.vegaTypings.vegaTypingsStrings.lemonchiffon = "lemonchiffon".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lemonchiffon]
    
    @scala.inline
    def lightblue: typings.vegaTypings.vegaTypingsStrings.lightblue = "lightblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightblue]
    
    @scala.inline
    def lightcoral: typings.vegaTypings.vegaTypingsStrings.lightcoral = "lightcoral".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightcoral]
    
    @scala.inline
    def lightcyan: typings.vegaTypings.vegaTypingsStrings.lightcyan = "lightcyan".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightcyan]
    
    @scala.inline
    def lightgoldenrodyellow: typings.vegaTypings.vegaTypingsStrings.lightgoldenrodyellow = "lightgoldenrodyellow".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightgoldenrodyellow]
    
    @scala.inline
    def lightgray: typings.vegaTypings.vegaTypingsStrings.lightgray = "lightgray".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightgray]
    
    @scala.inline
    def lightgreen: typings.vegaTypings.vegaTypingsStrings.lightgreen = "lightgreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightgreen]
    
    @scala.inline
    def lightgrey: typings.vegaTypings.vegaTypingsStrings.lightgrey = "lightgrey".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightgrey]
    
    @scala.inline
    def lightpink: typings.vegaTypings.vegaTypingsStrings.lightpink = "lightpink".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightpink]
    
    @scala.inline
    def lightsalmon: typings.vegaTypings.vegaTypingsStrings.lightsalmon = "lightsalmon".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightsalmon]
    
    @scala.inline
    def lightseagreen: typings.vegaTypings.vegaTypingsStrings.lightseagreen = "lightseagreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightseagreen]
    
    @scala.inline
    def lightskyblue: typings.vegaTypings.vegaTypingsStrings.lightskyblue = "lightskyblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightskyblue]
    
    @scala.inline
    def lightslategray: typings.vegaTypings.vegaTypingsStrings.lightslategray = "lightslategray".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightslategray]
    
    @scala.inline
    def lightslategrey: typings.vegaTypings.vegaTypingsStrings.lightslategrey = "lightslategrey".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightslategrey]
    
    @scala.inline
    def lightsteelblue: typings.vegaTypings.vegaTypingsStrings.lightsteelblue = "lightsteelblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightsteelblue]
    
    @scala.inline
    def lightyellow: typings.vegaTypings.vegaTypingsStrings.lightyellow = "lightyellow".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightyellow]
    
    @scala.inline
    def lime: typings.vegaTypings.vegaTypingsStrings.lime = "lime".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lime]
    
    @scala.inline
    def limegreen: typings.vegaTypings.vegaTypingsStrings.limegreen = "limegreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.limegreen]
    
    @scala.inline
    def linen: typings.vegaTypings.vegaTypingsStrings.linen = "linen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.linen]
    
    @scala.inline
    def magenta: typings.vegaTypings.vegaTypingsStrings.magenta = "magenta".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.magenta]
    
    @scala.inline
    def maroon: typings.vegaTypings.vegaTypingsStrings.maroon = "maroon".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.maroon]
    
    @scala.inline
    def mediumaquamarine: typings.vegaTypings.vegaTypingsStrings.mediumaquamarine = "mediumaquamarine".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumaquamarine]
    
    @scala.inline
    def mediumblue: typings.vegaTypings.vegaTypingsStrings.mediumblue = "mediumblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumblue]
    
    @scala.inline
    def mediumorchid: typings.vegaTypings.vegaTypingsStrings.mediumorchid = "mediumorchid".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumorchid]
    
    @scala.inline
    def mediumpurple: typings.vegaTypings.vegaTypingsStrings.mediumpurple = "mediumpurple".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumpurple]
    
    @scala.inline
    def mediumseagreen: typings.vegaTypings.vegaTypingsStrings.mediumseagreen = "mediumseagreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumseagreen]
    
    @scala.inline
    def mediumslateblue: typings.vegaTypings.vegaTypingsStrings.mediumslateblue = "mediumslateblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumslateblue]
    
    @scala.inline
    def mediumspringgreen: typings.vegaTypings.vegaTypingsStrings.mediumspringgreen = "mediumspringgreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumspringgreen]
    
    @scala.inline
    def mediumturquoise: typings.vegaTypings.vegaTypingsStrings.mediumturquoise = "mediumturquoise".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumturquoise]
    
    @scala.inline
    def mediumvioletred: typings.vegaTypings.vegaTypingsStrings.mediumvioletred = "mediumvioletred".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumvioletred]
    
    @scala.inline
    def midnightblue: typings.vegaTypings.vegaTypingsStrings.midnightblue = "midnightblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.midnightblue]
    
    @scala.inline
    def mintcream: typings.vegaTypings.vegaTypingsStrings.mintcream = "mintcream".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mintcream]
    
    @scala.inline
    def mistyrose: typings.vegaTypings.vegaTypingsStrings.mistyrose = "mistyrose".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mistyrose]
    
    @scala.inline
    def moccasin: typings.vegaTypings.vegaTypingsStrings.moccasin = "moccasin".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.moccasin]
    
    @scala.inline
    def navajowhite: typings.vegaTypings.vegaTypingsStrings.navajowhite = "navajowhite".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.navajowhite]
    
    @scala.inline
    def navy: typings.vegaTypings.vegaTypingsStrings.navy = "navy".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.navy]
    
    @scala.inline
    def oldlace: typings.vegaTypings.vegaTypingsStrings.oldlace = "oldlace".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.oldlace]
    
    @scala.inline
    def olive: typings.vegaTypings.vegaTypingsStrings.olive = "olive".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.olive]
    
    @scala.inline
    def olivedrab: typings.vegaTypings.vegaTypingsStrings.olivedrab = "olivedrab".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.olivedrab]
    
    @scala.inline
    def orange: typings.vegaTypings.vegaTypingsStrings.orange = "orange".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.orange]
    
    @scala.inline
    def orangered: typings.vegaTypings.vegaTypingsStrings.orangered = "orangered".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.orangered]
    
    @scala.inline
    def orchid: typings.vegaTypings.vegaTypingsStrings.orchid = "orchid".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.orchid]
    
    @scala.inline
    def palegoldenrod: typings.vegaTypings.vegaTypingsStrings.palegoldenrod = "palegoldenrod".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.palegoldenrod]
    
    @scala.inline
    def palegreen: typings.vegaTypings.vegaTypingsStrings.palegreen = "palegreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.palegreen]
    
    @scala.inline
    def paleturquoise: typings.vegaTypings.vegaTypingsStrings.paleturquoise = "paleturquoise".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.paleturquoise]
    
    @scala.inline
    def palevioletred: typings.vegaTypings.vegaTypingsStrings.palevioletred = "palevioletred".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.palevioletred]
    
    @scala.inline
    def papayawhip: typings.vegaTypings.vegaTypingsStrings.papayawhip = "papayawhip".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.papayawhip]
    
    @scala.inline
    def peachpuff: typings.vegaTypings.vegaTypingsStrings.peachpuff = "peachpuff".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.peachpuff]
    
    @scala.inline
    def peru: typings.vegaTypings.vegaTypingsStrings.peru = "peru".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.peru]
    
    @scala.inline
    def pink: typings.vegaTypings.vegaTypingsStrings.pink = "pink".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.pink]
    
    @scala.inline
    def plum: typings.vegaTypings.vegaTypingsStrings.plum = "plum".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.plum]
    
    @scala.inline
    def powderblue: typings.vegaTypings.vegaTypingsStrings.powderblue = "powderblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.powderblue]
    
    @scala.inline
    def purple: typings.vegaTypings.vegaTypingsStrings.purple = "purple".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.purple]
    
    @scala.inline
    def rebeccapurple: typings.vegaTypings.vegaTypingsStrings.rebeccapurple = "rebeccapurple".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.rebeccapurple]
    
    @scala.inline
    def red: typings.vegaTypings.vegaTypingsStrings.red = "red".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.red]
    
    @scala.inline
    def rosybrown: typings.vegaTypings.vegaTypingsStrings.rosybrown = "rosybrown".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.rosybrown]
    
    @scala.inline
    def royalblue: typings.vegaTypings.vegaTypingsStrings.royalblue = "royalblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.royalblue]
    
    @scala.inline
    def saddlebrown: typings.vegaTypings.vegaTypingsStrings.saddlebrown = "saddlebrown".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.saddlebrown]
    
    @scala.inline
    def salmon: typings.vegaTypings.vegaTypingsStrings.salmon = "salmon".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.salmon]
    
    @scala.inline
    def sandybrown: typings.vegaTypings.vegaTypingsStrings.sandybrown = "sandybrown".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.sandybrown]
    
    @scala.inline
    def seagreen: typings.vegaTypings.vegaTypingsStrings.seagreen = "seagreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.seagreen]
    
    @scala.inline
    def seashell: typings.vegaTypings.vegaTypingsStrings.seashell = "seashell".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.seashell]
    
    @scala.inline
    def sienna: typings.vegaTypings.vegaTypingsStrings.sienna = "sienna".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.sienna]
    
    @scala.inline
    def silver: typings.vegaTypings.vegaTypingsStrings.silver = "silver".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.silver]
    
    @scala.inline
    def skyblue: typings.vegaTypings.vegaTypingsStrings.skyblue = "skyblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.skyblue]
    
    @scala.inline
    def slateblue: typings.vegaTypings.vegaTypingsStrings.slateblue = "slateblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.slateblue]
    
    @scala.inline
    def slategray: typings.vegaTypings.vegaTypingsStrings.slategray = "slategray".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.slategray]
    
    @scala.inline
    def slategrey: typings.vegaTypings.vegaTypingsStrings.slategrey = "slategrey".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.slategrey]
    
    @scala.inline
    def snow: typings.vegaTypings.vegaTypingsStrings.snow = "snow".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.snow]
    
    @scala.inline
    def springgreen: typings.vegaTypings.vegaTypingsStrings.springgreen = "springgreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.springgreen]
    
    @scala.inline
    def steelblue: typings.vegaTypings.vegaTypingsStrings.steelblue = "steelblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.steelblue]
    
    @scala.inline
    def tan: typings.vegaTypings.vegaTypingsStrings.tan = "tan".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.tan]
    
    @scala.inline
    def teal: typings.vegaTypings.vegaTypingsStrings.teal = "teal".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.teal]
    
    @scala.inline
    def thistle: typings.vegaTypings.vegaTypingsStrings.thistle = "thistle".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.thistle]
    
    @scala.inline
    def tomato: typings.vegaTypings.vegaTypingsStrings.tomato = "tomato".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.tomato]
    
    @scala.inline
    def turquoise: typings.vegaTypings.vegaTypingsStrings.turquoise = "turquoise".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.turquoise]
    
    @scala.inline
    def violet: typings.vegaTypings.vegaTypingsStrings.violet = "violet".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.violet]
    
    @scala.inline
    def wheat: typings.vegaTypings.vegaTypingsStrings.wheat = "wheat".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.wheat]
    
    @scala.inline
    def white: typings.vegaTypings.vegaTypingsStrings.white = "white".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.white]
    
    @scala.inline
    def whitesmoke: typings.vegaTypings.vegaTypingsStrings.whitesmoke = "whitesmoke".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.whitesmoke]
    
    @scala.inline
    def yellow: typings.vegaTypings.vegaTypingsStrings.yellow = "yellow".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.yellow]
    
    @scala.inline
    def yellowgreen: typings.vegaTypings.vegaTypingsStrings.yellowgreen = "yellowgreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.yellowgreen]
  }
  
  type HexColor = String
}
