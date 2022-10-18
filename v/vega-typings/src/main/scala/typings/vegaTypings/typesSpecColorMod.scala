package typings.vegaTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSpecColorMod {
  
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
    
    inline def aliceblue: typings.vegaTypings.vegaTypingsStrings.aliceblue = "aliceblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.aliceblue]
    
    inline def antiquewhite: typings.vegaTypings.vegaTypingsStrings.antiquewhite = "antiquewhite".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.antiquewhite]
    
    inline def aqua: typings.vegaTypings.vegaTypingsStrings.aqua = "aqua".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.aqua]
    
    inline def aquamarine: typings.vegaTypings.vegaTypingsStrings.aquamarine = "aquamarine".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.aquamarine]
    
    inline def azure: typings.vegaTypings.vegaTypingsStrings.azure = "azure".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.azure]
    
    inline def beige: typings.vegaTypings.vegaTypingsStrings.beige = "beige".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.beige]
    
    inline def bisque: typings.vegaTypings.vegaTypingsStrings.bisque = "bisque".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.bisque]
    
    inline def black: typings.vegaTypings.vegaTypingsStrings.black = "black".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.black]
    
    inline def blanchedalmond: typings.vegaTypings.vegaTypingsStrings.blanchedalmond = "blanchedalmond".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.blanchedalmond]
    
    inline def blue: typings.vegaTypings.vegaTypingsStrings.blue = "blue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.blue]
    
    inline def blueviolet: typings.vegaTypings.vegaTypingsStrings.blueviolet = "blueviolet".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.blueviolet]
    
    inline def brown: typings.vegaTypings.vegaTypingsStrings.brown = "brown".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.brown]
    
    inline def burlywood: typings.vegaTypings.vegaTypingsStrings.burlywood = "burlywood".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.burlywood]
    
    inline def cadetblue: typings.vegaTypings.vegaTypingsStrings.cadetblue = "cadetblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.cadetblue]
    
    inline def chartreuse: typings.vegaTypings.vegaTypingsStrings.chartreuse = "chartreuse".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.chartreuse]
    
    inline def chocolate: typings.vegaTypings.vegaTypingsStrings.chocolate = "chocolate".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.chocolate]
    
    inline def coral: typings.vegaTypings.vegaTypingsStrings.coral = "coral".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.coral]
    
    inline def cornflowerblue: typings.vegaTypings.vegaTypingsStrings.cornflowerblue = "cornflowerblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.cornflowerblue]
    
    inline def cornsilk: typings.vegaTypings.vegaTypingsStrings.cornsilk = "cornsilk".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.cornsilk]
    
    inline def crimson: typings.vegaTypings.vegaTypingsStrings.crimson = "crimson".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.crimson]
    
    inline def cyan: typings.vegaTypings.vegaTypingsStrings.cyan = "cyan".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.cyan]
    
    inline def darkblue: typings.vegaTypings.vegaTypingsStrings.darkblue = "darkblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkblue]
    
    inline def darkcyan: typings.vegaTypings.vegaTypingsStrings.darkcyan = "darkcyan".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkcyan]
    
    inline def darkgoldenrod: typings.vegaTypings.vegaTypingsStrings.darkgoldenrod = "darkgoldenrod".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkgoldenrod]
    
    inline def darkgray: typings.vegaTypings.vegaTypingsStrings.darkgray = "darkgray".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkgray]
    
    inline def darkgreen: typings.vegaTypings.vegaTypingsStrings.darkgreen = "darkgreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkgreen]
    
    inline def darkgrey: typings.vegaTypings.vegaTypingsStrings.darkgrey = "darkgrey".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkgrey]
    
    inline def darkkhaki: typings.vegaTypings.vegaTypingsStrings.darkkhaki = "darkkhaki".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkkhaki]
    
    inline def darkmagenta: typings.vegaTypings.vegaTypingsStrings.darkmagenta = "darkmagenta".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkmagenta]
    
    inline def darkolivegreen: typings.vegaTypings.vegaTypingsStrings.darkolivegreen = "darkolivegreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkolivegreen]
    
    inline def darkorange: typings.vegaTypings.vegaTypingsStrings.darkorange = "darkorange".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkorange]
    
    inline def darkorchid: typings.vegaTypings.vegaTypingsStrings.darkorchid = "darkorchid".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkorchid]
    
    inline def darkred: typings.vegaTypings.vegaTypingsStrings.darkred = "darkred".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkred]
    
    inline def darksalmon: typings.vegaTypings.vegaTypingsStrings.darksalmon = "darksalmon".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darksalmon]
    
    inline def darkseagreen: typings.vegaTypings.vegaTypingsStrings.darkseagreen = "darkseagreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkseagreen]
    
    inline def darkslateblue: typings.vegaTypings.vegaTypingsStrings.darkslateblue = "darkslateblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkslateblue]
    
    inline def darkslategray: typings.vegaTypings.vegaTypingsStrings.darkslategray = "darkslategray".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkslategray]
    
    inline def darkslategrey: typings.vegaTypings.vegaTypingsStrings.darkslategrey = "darkslategrey".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkslategrey]
    
    inline def darkturquoise: typings.vegaTypings.vegaTypingsStrings.darkturquoise = "darkturquoise".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkturquoise]
    
    inline def darkviolet: typings.vegaTypings.vegaTypingsStrings.darkviolet = "darkviolet".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.darkviolet]
    
    inline def deeppink: typings.vegaTypings.vegaTypingsStrings.deeppink = "deeppink".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.deeppink]
    
    inline def deepskyblue: typings.vegaTypings.vegaTypingsStrings.deepskyblue = "deepskyblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.deepskyblue]
    
    inline def dimgray: typings.vegaTypings.vegaTypingsStrings.dimgray = "dimgray".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.dimgray]
    
    inline def dimgrey: typings.vegaTypings.vegaTypingsStrings.dimgrey = "dimgrey".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.dimgrey]
    
    inline def dodgerblue: typings.vegaTypings.vegaTypingsStrings.dodgerblue = "dodgerblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.dodgerblue]
    
    inline def firebrick: typings.vegaTypings.vegaTypingsStrings.firebrick = "firebrick".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.firebrick]
    
    inline def floralwhite: typings.vegaTypings.vegaTypingsStrings.floralwhite = "floralwhite".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.floralwhite]
    
    inline def forestgreen: typings.vegaTypings.vegaTypingsStrings.forestgreen = "forestgreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.forestgreen]
    
    inline def fuchsia: typings.vegaTypings.vegaTypingsStrings.fuchsia = "fuchsia".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.fuchsia]
    
    inline def gainsboro: typings.vegaTypings.vegaTypingsStrings.gainsboro = "gainsboro".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.gainsboro]
    
    inline def ghostwhite: typings.vegaTypings.vegaTypingsStrings.ghostwhite = "ghostwhite".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.ghostwhite]
    
    inline def gold: typings.vegaTypings.vegaTypingsStrings.gold = "gold".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.gold]
    
    inline def goldenrod: typings.vegaTypings.vegaTypingsStrings.goldenrod = "goldenrod".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.goldenrod]
    
    inline def gray: typings.vegaTypings.vegaTypingsStrings.gray = "gray".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.gray]
    
    inline def green: typings.vegaTypings.vegaTypingsStrings.green = "green".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.green]
    
    inline def greenyellow: typings.vegaTypings.vegaTypingsStrings.greenyellow = "greenyellow".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.greenyellow]
    
    inline def grey: typings.vegaTypings.vegaTypingsStrings.grey = "grey".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.grey]
    
    inline def honeydew: typings.vegaTypings.vegaTypingsStrings.honeydew = "honeydew".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.honeydew]
    
    inline def hotpink: typings.vegaTypings.vegaTypingsStrings.hotpink = "hotpink".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.hotpink]
    
    inline def indianred: typings.vegaTypings.vegaTypingsStrings.indianred = "indianred".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.indianred]
    
    inline def indigo: typings.vegaTypings.vegaTypingsStrings.indigo = "indigo".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.indigo]
    
    inline def ivory: typings.vegaTypings.vegaTypingsStrings.ivory = "ivory".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.ivory]
    
    inline def khaki: typings.vegaTypings.vegaTypingsStrings.khaki = "khaki".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.khaki]
    
    inline def lavender: typings.vegaTypings.vegaTypingsStrings.lavender = "lavender".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lavender]
    
    inline def lavenderblush: typings.vegaTypings.vegaTypingsStrings.lavenderblush = "lavenderblush".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lavenderblush]
    
    inline def lawngreen: typings.vegaTypings.vegaTypingsStrings.lawngreen = "lawngreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lawngreen]
    
    inline def lemonchiffon: typings.vegaTypings.vegaTypingsStrings.lemonchiffon = "lemonchiffon".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lemonchiffon]
    
    inline def lightblue: typings.vegaTypings.vegaTypingsStrings.lightblue = "lightblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightblue]
    
    inline def lightcoral: typings.vegaTypings.vegaTypingsStrings.lightcoral = "lightcoral".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightcoral]
    
    inline def lightcyan: typings.vegaTypings.vegaTypingsStrings.lightcyan = "lightcyan".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightcyan]
    
    inline def lightgoldenrodyellow: typings.vegaTypings.vegaTypingsStrings.lightgoldenrodyellow = "lightgoldenrodyellow".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightgoldenrodyellow]
    
    inline def lightgray: typings.vegaTypings.vegaTypingsStrings.lightgray = "lightgray".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightgray]
    
    inline def lightgreen: typings.vegaTypings.vegaTypingsStrings.lightgreen = "lightgreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightgreen]
    
    inline def lightgrey: typings.vegaTypings.vegaTypingsStrings.lightgrey = "lightgrey".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightgrey]
    
    inline def lightpink: typings.vegaTypings.vegaTypingsStrings.lightpink = "lightpink".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightpink]
    
    inline def lightsalmon: typings.vegaTypings.vegaTypingsStrings.lightsalmon = "lightsalmon".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightsalmon]
    
    inline def lightseagreen: typings.vegaTypings.vegaTypingsStrings.lightseagreen = "lightseagreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightseagreen]
    
    inline def lightskyblue: typings.vegaTypings.vegaTypingsStrings.lightskyblue = "lightskyblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightskyblue]
    
    inline def lightslategray: typings.vegaTypings.vegaTypingsStrings.lightslategray = "lightslategray".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightslategray]
    
    inline def lightslategrey: typings.vegaTypings.vegaTypingsStrings.lightslategrey = "lightslategrey".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightslategrey]
    
    inline def lightsteelblue: typings.vegaTypings.vegaTypingsStrings.lightsteelblue = "lightsteelblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightsteelblue]
    
    inline def lightyellow: typings.vegaTypings.vegaTypingsStrings.lightyellow = "lightyellow".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lightyellow]
    
    inline def lime: typings.vegaTypings.vegaTypingsStrings.lime = "lime".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.lime]
    
    inline def limegreen: typings.vegaTypings.vegaTypingsStrings.limegreen = "limegreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.limegreen]
    
    inline def linen: typings.vegaTypings.vegaTypingsStrings.linen = "linen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.linen]
    
    inline def magenta: typings.vegaTypings.vegaTypingsStrings.magenta = "magenta".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.magenta]
    
    inline def maroon: typings.vegaTypings.vegaTypingsStrings.maroon = "maroon".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.maroon]
    
    inline def mediumaquamarine: typings.vegaTypings.vegaTypingsStrings.mediumaquamarine = "mediumaquamarine".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumaquamarine]
    
    inline def mediumblue: typings.vegaTypings.vegaTypingsStrings.mediumblue = "mediumblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumblue]
    
    inline def mediumorchid: typings.vegaTypings.vegaTypingsStrings.mediumorchid = "mediumorchid".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumorchid]
    
    inline def mediumpurple: typings.vegaTypings.vegaTypingsStrings.mediumpurple = "mediumpurple".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumpurple]
    
    inline def mediumseagreen: typings.vegaTypings.vegaTypingsStrings.mediumseagreen = "mediumseagreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumseagreen]
    
    inline def mediumslateblue: typings.vegaTypings.vegaTypingsStrings.mediumslateblue = "mediumslateblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumslateblue]
    
    inline def mediumspringgreen: typings.vegaTypings.vegaTypingsStrings.mediumspringgreen = "mediumspringgreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumspringgreen]
    
    inline def mediumturquoise: typings.vegaTypings.vegaTypingsStrings.mediumturquoise = "mediumturquoise".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumturquoise]
    
    inline def mediumvioletred: typings.vegaTypings.vegaTypingsStrings.mediumvioletred = "mediumvioletred".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mediumvioletred]
    
    inline def midnightblue: typings.vegaTypings.vegaTypingsStrings.midnightblue = "midnightblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.midnightblue]
    
    inline def mintcream: typings.vegaTypings.vegaTypingsStrings.mintcream = "mintcream".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mintcream]
    
    inline def mistyrose: typings.vegaTypings.vegaTypingsStrings.mistyrose = "mistyrose".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.mistyrose]
    
    inline def moccasin: typings.vegaTypings.vegaTypingsStrings.moccasin = "moccasin".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.moccasin]
    
    inline def navajowhite: typings.vegaTypings.vegaTypingsStrings.navajowhite = "navajowhite".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.navajowhite]
    
    inline def navy: typings.vegaTypings.vegaTypingsStrings.navy = "navy".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.navy]
    
    inline def oldlace: typings.vegaTypings.vegaTypingsStrings.oldlace = "oldlace".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.oldlace]
    
    inline def olive: typings.vegaTypings.vegaTypingsStrings.olive = "olive".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.olive]
    
    inline def olivedrab: typings.vegaTypings.vegaTypingsStrings.olivedrab = "olivedrab".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.olivedrab]
    
    inline def orange: typings.vegaTypings.vegaTypingsStrings.orange = "orange".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.orange]
    
    inline def orangered: typings.vegaTypings.vegaTypingsStrings.orangered = "orangered".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.orangered]
    
    inline def orchid: typings.vegaTypings.vegaTypingsStrings.orchid = "orchid".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.orchid]
    
    inline def palegoldenrod: typings.vegaTypings.vegaTypingsStrings.palegoldenrod = "palegoldenrod".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.palegoldenrod]
    
    inline def palegreen: typings.vegaTypings.vegaTypingsStrings.palegreen = "palegreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.palegreen]
    
    inline def paleturquoise: typings.vegaTypings.vegaTypingsStrings.paleturquoise = "paleturquoise".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.paleturquoise]
    
    inline def palevioletred: typings.vegaTypings.vegaTypingsStrings.palevioletred = "palevioletred".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.palevioletred]
    
    inline def papayawhip: typings.vegaTypings.vegaTypingsStrings.papayawhip = "papayawhip".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.papayawhip]
    
    inline def peachpuff: typings.vegaTypings.vegaTypingsStrings.peachpuff = "peachpuff".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.peachpuff]
    
    inline def peru: typings.vegaTypings.vegaTypingsStrings.peru = "peru".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.peru]
    
    inline def pink: typings.vegaTypings.vegaTypingsStrings.pink = "pink".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.pink]
    
    inline def plum: typings.vegaTypings.vegaTypingsStrings.plum = "plum".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.plum]
    
    inline def powderblue: typings.vegaTypings.vegaTypingsStrings.powderblue = "powderblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.powderblue]
    
    inline def purple: typings.vegaTypings.vegaTypingsStrings.purple = "purple".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.purple]
    
    inline def rebeccapurple: typings.vegaTypings.vegaTypingsStrings.rebeccapurple = "rebeccapurple".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.rebeccapurple]
    
    inline def red: typings.vegaTypings.vegaTypingsStrings.red = "red".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.red]
    
    inline def rosybrown: typings.vegaTypings.vegaTypingsStrings.rosybrown = "rosybrown".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.rosybrown]
    
    inline def royalblue: typings.vegaTypings.vegaTypingsStrings.royalblue = "royalblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.royalblue]
    
    inline def saddlebrown: typings.vegaTypings.vegaTypingsStrings.saddlebrown = "saddlebrown".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.saddlebrown]
    
    inline def salmon: typings.vegaTypings.vegaTypingsStrings.salmon = "salmon".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.salmon]
    
    inline def sandybrown: typings.vegaTypings.vegaTypingsStrings.sandybrown = "sandybrown".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.sandybrown]
    
    inline def seagreen: typings.vegaTypings.vegaTypingsStrings.seagreen = "seagreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.seagreen]
    
    inline def seashell: typings.vegaTypings.vegaTypingsStrings.seashell = "seashell".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.seashell]
    
    inline def sienna: typings.vegaTypings.vegaTypingsStrings.sienna = "sienna".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.sienna]
    
    inline def silver: typings.vegaTypings.vegaTypingsStrings.silver = "silver".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.silver]
    
    inline def skyblue: typings.vegaTypings.vegaTypingsStrings.skyblue = "skyblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.skyblue]
    
    inline def slateblue: typings.vegaTypings.vegaTypingsStrings.slateblue = "slateblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.slateblue]
    
    inline def slategray: typings.vegaTypings.vegaTypingsStrings.slategray = "slategray".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.slategray]
    
    inline def slategrey: typings.vegaTypings.vegaTypingsStrings.slategrey = "slategrey".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.slategrey]
    
    inline def snow: typings.vegaTypings.vegaTypingsStrings.snow = "snow".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.snow]
    
    inline def springgreen: typings.vegaTypings.vegaTypingsStrings.springgreen = "springgreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.springgreen]
    
    inline def steelblue: typings.vegaTypings.vegaTypingsStrings.steelblue = "steelblue".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.steelblue]
    
    inline def tan: typings.vegaTypings.vegaTypingsStrings.tan = "tan".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.tan]
    
    inline def teal: typings.vegaTypings.vegaTypingsStrings.teal = "teal".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.teal]
    
    inline def thistle: typings.vegaTypings.vegaTypingsStrings.thistle = "thistle".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.thistle]
    
    inline def tomato: typings.vegaTypings.vegaTypingsStrings.tomato = "tomato".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.tomato]
    
    inline def turquoise: typings.vegaTypings.vegaTypingsStrings.turquoise = "turquoise".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.turquoise]
    
    inline def violet: typings.vegaTypings.vegaTypingsStrings.violet = "violet".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.violet]
    
    inline def wheat: typings.vegaTypings.vegaTypingsStrings.wheat = "wheat".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.wheat]
    
    inline def white: typings.vegaTypings.vegaTypingsStrings.white = "white".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.white]
    
    inline def whitesmoke: typings.vegaTypings.vegaTypingsStrings.whitesmoke = "whitesmoke".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.whitesmoke]
    
    inline def yellow: typings.vegaTypings.vegaTypingsStrings.yellow = "yellow".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.yellow]
    
    inline def yellowgreen: typings.vegaTypings.vegaTypingsStrings.yellowgreen = "yellowgreen".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.yellowgreen]
  }
  
  type HexColor = String
}
