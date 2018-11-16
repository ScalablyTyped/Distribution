package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ConfirmType extends js.Object {
  /**
           * 当点击完成时键盘是否收起
           */
  var confirmHold: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * 键盘右下角 confirm 按钮的类型，只影响按钮的文本内容
           */
  var confirmType: js.UndefOr[
    wegameDashApiLib.wegameDashApiLibStrings.done | wegameDashApiLib.wegameDashApiLibStrings.next | wegameDashApiLib.wegameDashApiLibStrings.search | wegameDashApiLib.wegameDashApiLibStrings.go | wegameDashApiLib.wegameDashApiLibStrings.send
  ] = js.undefined
  /**
           * 键盘输入框显示的默认值
           */
  var defaultValue: java.lang.String
  /**
           * 键盘中文本的最大长度
           */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /**
           * 是否为多行输入
           */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
}

