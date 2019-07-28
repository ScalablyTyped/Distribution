package typings.vegaDashEmbed

import typings.vegaDashEmbed.vegaDashEmbedStrings.align
import typings.vegaDashEmbed.vegaDashEmbedStrings.angle
import typings.vegaDashEmbed.vegaDashEmbedStrings.baseline
import typings.vegaDashEmbed.vegaDashEmbedStrings.color
import typings.vegaDashEmbed.vegaDashEmbedStrings.cornerRadius
import typings.vegaDashEmbed.vegaDashEmbedStrings.cursor
import typings.vegaDashEmbed.vegaDashEmbedStrings.dir
import typings.vegaDashEmbed.vegaDashEmbedStrings.dx
import typings.vegaDashEmbed.vegaDashEmbedStrings.dy
import typings.vegaDashEmbed.vegaDashEmbedStrings.ellipsis
import typings.vegaDashEmbed.vegaDashEmbedStrings.extent
import typings.vegaDashEmbed.vegaDashEmbedStrings.fill
import typings.vegaDashEmbed.vegaDashEmbedStrings.fillOpacity
import typings.vegaDashEmbed.vegaDashEmbedStrings.filled
import typings.vegaDashEmbed.vegaDashEmbedStrings.font
import typings.vegaDashEmbed.vegaDashEmbedStrings.fontSize
import typings.vegaDashEmbed.vegaDashEmbedStrings.fontStyle
import typings.vegaDashEmbed.vegaDashEmbedStrings.fontWeight
import typings.vegaDashEmbed.vegaDashEmbedStrings.href
import typings.vegaDashEmbed.vegaDashEmbedStrings.interpolate
import typings.vegaDashEmbed.vegaDashEmbedStrings.limit
import typings.vegaDashEmbed.vegaDashEmbedStrings.opacity
import typings.vegaDashEmbed.vegaDashEmbedStrings.orient
import typings.vegaDashEmbed.vegaDashEmbedStrings.radius
import typings.vegaDashEmbed.vegaDashEmbedStrings.shape
import typings.vegaDashEmbed.vegaDashEmbedStrings.size
import typings.vegaDashEmbed.vegaDashEmbedStrings.stroke
import typings.vegaDashEmbed.vegaDashEmbedStrings.strokeCap
import typings.vegaDashEmbed.vegaDashEmbedStrings.strokeDash
import typings.vegaDashEmbed.vegaDashEmbedStrings.strokeDashOffset
import typings.vegaDashEmbed.vegaDashEmbedStrings.strokeJoin
import typings.vegaDashEmbed.vegaDashEmbedStrings.strokeMiterLimit
import typings.vegaDashEmbed.vegaDashEmbedStrings.strokeOpacity
import typings.vegaDashEmbed.vegaDashEmbedStrings.strokeWidth
import typings.vegaDashEmbed.vegaDashEmbedStrings.tension
import typings.vegaDashEmbed.vegaDashEmbedStrings.text
import typings.vegaDashEmbed.vegaDashEmbedStrings.theta
import typings.vegaDashEmbed.vegaDashEmbedStrings.tooltip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var box: js.UndefOr[
    js.Array[
      dir | font | text | shape | orient | extent | color | fill | stroke | opacity | size | tooltip | href | interpolate | angle | baseline | fontSize | fontWeight | limit | strokeWidth | strokeDash | strokeDashOffset | strokeOpacity | strokeJoin | strokeMiterLimit | fillOpacity | filled | strokeCap | tension | align | dx | dy | radius | ellipsis | theta | fontStyle | cursor | cornerRadius
    ]
  ] = js.undefined
  var boxMid: js.UndefOr[
    js.Array[
      dir | font | text | shape | orient | color | fill | stroke | opacity | size | tooltip | href | interpolate | angle | baseline | fontSize | fontWeight | limit | strokeWidth | strokeDash | strokeDashOffset | strokeOpacity | strokeJoin | strokeMiterLimit | fillOpacity | filled | strokeCap | tension | align | dx | dy | radius | ellipsis | theta | fontStyle | cursor | cornerRadius
    ]
  ] = js.undefined
  var boxWhisker: js.UndefOr[
    js.Array[
      dir | font | text | shape | orient | color | fill | stroke | opacity | size | tooltip | href | interpolate | angle | baseline | fontSize | fontWeight | limit | strokeWidth | strokeDash | strokeDashOffset | strokeOpacity | strokeJoin | strokeMiterLimit | fillOpacity | filled | strokeCap | tension | align | dx | dy | radius | ellipsis | theta | fontStyle | cursor | cornerRadius
    ]
  ] = js.undefined
}

object Anon_Align {
  @scala.inline
  def apply(
    box: js.Array[
      dir | font | text | shape | orient | extent | color | fill | stroke | opacity | size | tooltip | href | interpolate | angle | baseline | fontSize | fontWeight | limit | strokeWidth | strokeDash | strokeDashOffset | strokeOpacity | strokeJoin | strokeMiterLimit | fillOpacity | filled | strokeCap | tension | align | dx | dy | radius | ellipsis | theta | fontStyle | cursor | cornerRadius
    ] = null,
    boxMid: js.Array[
      dir | font | text | shape | orient | color | fill | stroke | opacity | size | tooltip | href | interpolate | angle | baseline | fontSize | fontWeight | limit | strokeWidth | strokeDash | strokeDashOffset | strokeOpacity | strokeJoin | strokeMiterLimit | fillOpacity | filled | strokeCap | tension | align | dx | dy | radius | ellipsis | theta | fontStyle | cursor | cornerRadius
    ] = null,
    boxWhisker: js.Array[
      dir | font | text | shape | orient | color | fill | stroke | opacity | size | tooltip | href | interpolate | angle | baseline | fontSize | fontWeight | limit | strokeWidth | strokeDash | strokeDashOffset | strokeOpacity | strokeJoin | strokeMiterLimit | fillOpacity | filled | strokeCap | tension | align | dx | dy | radius | ellipsis | theta | fontStyle | cursor | cornerRadius
    ] = null
  ): Anon_Align = {
    val __obj = js.Dynamic.literal()
    if (box != null) __obj.updateDynamic("box")(box)
    if (boxMid != null) __obj.updateDynamic("boxMid")(boxMid)
    if (boxWhisker != null) __obj.updateDynamic("boxWhisker")(boxWhisker)
    __obj.asInstanceOf[Anon_Align]
  }
}

