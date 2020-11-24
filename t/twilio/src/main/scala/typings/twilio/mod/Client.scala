package typings.twilio.mod

import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "Client")
@js.native
class Client () extends js.Object {
  def this(sid: String) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: js.UndefOr[scala.Nothing], host: String) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: String, host: String) = this()
  def this(sid: String, tkn: js.UndefOr[scala.Nothing], host: String) = this()
  def this(sid: String, tkn: String, host: String) = this()
  def this(
    sid: js.UndefOr[scala.Nothing],
    tkn: js.UndefOr[scala.Nothing],
    host: js.UndefOr[scala.Nothing],
    api_version: String
  ) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: js.UndefOr[scala.Nothing], host: String, api_version: String) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: String, host: js.UndefOr[scala.Nothing], api_version: String) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: String, host: String, api_version: String) = this()
  def this(sid: String, tkn: js.UndefOr[scala.Nothing], host: js.UndefOr[scala.Nothing], api_version: String) = this()
  def this(sid: String, tkn: js.UndefOr[scala.Nothing], host: String, api_version: String) = this()
  def this(sid: String, tkn: String, host: js.UndefOr[scala.Nothing], api_version: String) = this()
  def this(sid: String, tkn: String, host: String, api_version: String) = this()
  def this(
    sid: js.UndefOr[scala.Nothing],
    tkn: js.UndefOr[scala.Nothing],
    host: js.UndefOr[scala.Nothing],
    api_version: js.UndefOr[scala.Nothing],
    timeout: Double
  ) = this()
  def this(
    sid: js.UndefOr[scala.Nothing],
    tkn: js.UndefOr[scala.Nothing],
    host: js.UndefOr[scala.Nothing],
    api_version: String,
    timeout: Double
  ) = this()
  def this(
    sid: js.UndefOr[scala.Nothing],
    tkn: js.UndefOr[scala.Nothing],
    host: String,
    api_version: js.UndefOr[scala.Nothing],
    timeout: Double
  ) = this()
  def this(
    sid: js.UndefOr[scala.Nothing],
    tkn: js.UndefOr[scala.Nothing],
    host: String,
    api_version: String,
    timeout: Double
  ) = this()
  def this(
    sid: js.UndefOr[scala.Nothing],
    tkn: String,
    host: js.UndefOr[scala.Nothing],
    api_version: js.UndefOr[scala.Nothing],
    timeout: Double
  ) = this()
  def this(
    sid: js.UndefOr[scala.Nothing],
    tkn: String,
    host: js.UndefOr[scala.Nothing],
    api_version: String,
    timeout: Double
  ) = this()
  def this(
    sid: js.UndefOr[scala.Nothing],
    tkn: String,
    host: String,
    api_version: js.UndefOr[scala.Nothing],
    timeout: Double
  ) = this()
  def this(sid: js.UndefOr[scala.Nothing], tkn: String, host: String, api_version: String, timeout: Double) = this()
  def this(
    sid: String,
    tkn: js.UndefOr[scala.Nothing],
    host: js.UndefOr[scala.Nothing],
    api_version: js.UndefOr[scala.Nothing],
    timeout: Double
  ) = this()
  def this(
    sid: String,
    tkn: js.UndefOr[scala.Nothing],
    host: js.UndefOr[scala.Nothing],
    api_version: String,
    timeout: Double
  ) = this()
  def this(
    sid: String,
    tkn: js.UndefOr[scala.Nothing],
    host: String,
    api_version: js.UndefOr[scala.Nothing],
    timeout: Double
  ) = this()
  def this(sid: String, tkn: js.UndefOr[scala.Nothing], host: String, api_version: String, timeout: Double) = this()
  def this(
    sid: String,
    tkn: String,
    host: js.UndefOr[scala.Nothing],
    api_version: js.UndefOr[scala.Nothing],
    timeout: Double
  ) = this()
  def this(sid: String, tkn: String, host: js.UndefOr[scala.Nothing], api_version: String, timeout: Double) = this()
  def this(sid: String, tkn: String, host: String, api_version: js.UndefOr[scala.Nothing], timeout: Double) = this()
  def this(sid: String, tkn: String, host: String, api_version: String, timeout: Double) = this()
  
  var accountSid: String = js.native
  
  var apiVersion: String = js.native
  
  var authToken: String = js.native
  
  def getBaseUrl(): String = js.native
  
  var host: String = js.native
  
  def request(options: ClientRequestOptions): Promise[_] = js.native
  def request(options: ClientRequestOptions, callback: RequestCallback): Promise[_] = js.native
  
  var timeout: Double = js.native
}
