package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectionConfig extends js.Object {
  /**
       * Once you set domain, driver will connect to SQL Server using domain login.
       */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Further options
       */
  var options: js.UndefOr[ConnectionOptions] = js.undefined
  /**
       * Password to use for authentication.
       */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Hostname to connect to.
       */
  var server: js.UndefOr[java.lang.String] = js.undefined
  /**
       * User name to use for authentication.
       */
  var userName: js.UndefOr[java.lang.String] = js.undefined
}

