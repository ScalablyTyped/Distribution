package typings.swaggerStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReqResStats extends js.Object {
  var apdex_satisfied: Double
  var apdex_score: Double
  var apdex_threshold: Double
  var apdex_tolerated: Double
  var avg_req_clength: Double
  var avg_res_clength: Double
  var avg_time: Double
  var client_error: Double
  var err_rate: Double
  var errors: Double
  var info: Double
  var max_req_clength: Double
  var max_res_clength: Double
  var max_time: Double
  var redirect: Double
  var req_rate: Double
  var requests: Double
  var responses: Double
  var server_error: Double
  var success: Double
  var total_req_clength: Double
  var total_res_clength: Double
  var total_time: Double
}

object ReqResStats {
  @scala.inline
  def apply(
    apdex_satisfied: Double,
    apdex_score: Double,
    apdex_threshold: Double,
    apdex_tolerated: Double,
    avg_req_clength: Double,
    avg_res_clength: Double,
    avg_time: Double,
    client_error: Double,
    err_rate: Double,
    errors: Double,
    info: Double,
    max_req_clength: Double,
    max_res_clength: Double,
    max_time: Double,
    redirect: Double,
    req_rate: Double,
    requests: Double,
    responses: Double,
    server_error: Double,
    success: Double,
    total_req_clength: Double,
    total_res_clength: Double,
    total_time: Double
  ): ReqResStats = {
    val __obj = js.Dynamic.literal(apdex_satisfied = apdex_satisfied.asInstanceOf[js.Any], apdex_score = apdex_score.asInstanceOf[js.Any], apdex_threshold = apdex_threshold.asInstanceOf[js.Any], apdex_tolerated = apdex_tolerated.asInstanceOf[js.Any], avg_req_clength = avg_req_clength.asInstanceOf[js.Any], avg_res_clength = avg_res_clength.asInstanceOf[js.Any], avg_time = avg_time.asInstanceOf[js.Any], client_error = client_error.asInstanceOf[js.Any], err_rate = err_rate.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], max_req_clength = max_req_clength.asInstanceOf[js.Any], max_res_clength = max_res_clength.asInstanceOf[js.Any], max_time = max_time.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], req_rate = req_rate.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], server_error = server_error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], total_req_clength = total_req_clength.asInstanceOf[js.Any], total_res_clength = total_res_clength.asInstanceOf[js.Any], total_time = total_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqResStats]
  }
}

