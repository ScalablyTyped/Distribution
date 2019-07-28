package typings.vegaDashEmbed

import typings.vegaDashEmbed.vegaDashEmbedStrings.`type`
import typings.vegaDashEmbed.vegaDashEmbedStrings.encode
import typings.vegaDashEmbed.vegaDashEmbedStrings.entryPadding
import typings.vegaDashEmbed.vegaDashEmbedStrings.fill
import typings.vegaDashEmbed.vegaDashEmbedStrings.format
import typings.vegaDashEmbed.vegaDashEmbedStrings.offset
import typings.vegaDashEmbed.vegaDashEmbedStrings.opacity
import typings.vegaDashEmbed.vegaDashEmbedStrings.orient
import typings.vegaDashEmbed.vegaDashEmbedStrings.padding
import typings.vegaDashEmbed.vegaDashEmbedStrings.shape
import typings.vegaDashEmbed.vegaDashEmbedStrings.size
import typings.vegaDashEmbed.vegaDashEmbedStrings.stroke
import typings.vegaDashEmbed.vegaDashEmbedStrings.tickCount
import typings.vegaDashEmbed.vegaDashEmbedStrings.title
import typings.vegaDashEmbed.vegaDashEmbedStrings.values
import typings.vegaDashEmbed.vegaDashEmbedStrings.zindex
import typings.vegaDashLite.buildSrcLegendMod.LegendConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoflegend extends js.Object {
  val LEGEND_PROPERTIES: js.Array[
    title | padding | `type` | orient | zindex | tickCount | format | values | offset | entryPadding
  ]
  val VG_LEGEND_PROPERTIES: js.Array[
    title | padding | `type` | shape | orient | zindex | tickCount | format | values | offset | encode | fill | stroke | opacity | size | entryPadding
  ]
  val defaultLegendConfig: LegendConfig
}

object Typeoflegend {
  @scala.inline
  def apply(
    LEGEND_PROPERTIES: js.Array[
      title | padding | `type` | orient | zindex | tickCount | format | values | offset | entryPadding
    ],
    VG_LEGEND_PROPERTIES: js.Array[
      title | padding | `type` | shape | orient | zindex | tickCount | format | values | offset | encode | fill | stroke | opacity | size | entryPadding
    ],
    defaultLegendConfig: LegendConfig
  ): Typeoflegend = {
    val __obj = js.Dynamic.literal(LEGEND_PROPERTIES = LEGEND_PROPERTIES, VG_LEGEND_PROPERTIES = VG_LEGEND_PROPERTIES, defaultLegendConfig = defaultLegendConfig)
  
    __obj.asInstanceOf[Typeoflegend]
  }
}

