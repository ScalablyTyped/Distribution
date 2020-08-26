package typings.winrtUwp.Windows.Networking.XboxLive

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait XboxLiveQualityOfServiceMeasurement extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var deviceAddresses: IVector[XboxLiveDeviceAddress] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var metricResults: IVectorView[XboxLiveQualityOfServiceMetricResult] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var metrics: IVector[XboxLiveQualityOfServiceMetric] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var numberOfProbesToAttempt: Double = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var numberOfResultsPending: Double = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var privatePayloadResults: IVectorView[XboxLiveQualityOfServicePrivatePayloadResult] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var shouldRequestPrivatePayloads: Boolean = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var timeoutInMilliseconds: Double = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param metric This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getMetricResult(deviceAddress: XboxLiveDeviceAddress, metric: XboxLiveQualityOfServiceMetric): XboxLiveQualityOfServiceMetricResult = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getMetricResultsForDevice(deviceAddress: XboxLiveDeviceAddress): IVectorView[XboxLiveQualityOfServiceMetricResult] = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param metric This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getMetricResultsForMetric(metric: XboxLiveQualityOfServiceMetric): IVectorView[XboxLiveQualityOfServiceMetricResult] = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param deviceAddress This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getPrivatePayloadResult(deviceAddress: XboxLiveDeviceAddress): XboxLiveQualityOfServicePrivatePayloadResult = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def measureAsync(): IPromiseWithIAsyncAction = js.native
}

object XboxLiveQualityOfServiceMeasurement {
  @scala.inline
  def apply(
    deviceAddresses: IVector[XboxLiveDeviceAddress],
    getMetricResult: (XboxLiveDeviceAddress, XboxLiveQualityOfServiceMetric) => XboxLiveQualityOfServiceMetricResult,
    getMetricResultsForDevice: XboxLiveDeviceAddress => IVectorView[XboxLiveQualityOfServiceMetricResult],
    getMetricResultsForMetric: XboxLiveQualityOfServiceMetric => IVectorView[XboxLiveQualityOfServiceMetricResult],
    getPrivatePayloadResult: XboxLiveDeviceAddress => XboxLiveQualityOfServicePrivatePayloadResult,
    measureAsync: () => IPromiseWithIAsyncAction,
    metricResults: IVectorView[XboxLiveQualityOfServiceMetricResult],
    metrics: IVector[XboxLiveQualityOfServiceMetric],
    numberOfProbesToAttempt: Double,
    numberOfResultsPending: Double,
    privatePayloadResults: IVectorView[XboxLiveQualityOfServicePrivatePayloadResult],
    shouldRequestPrivatePayloads: Boolean,
    timeoutInMilliseconds: Double
  ): XboxLiveQualityOfServiceMeasurement = {
    val __obj = js.Dynamic.literal(deviceAddresses = deviceAddresses.asInstanceOf[js.Any], getMetricResult = js.Any.fromFunction2(getMetricResult), getMetricResultsForDevice = js.Any.fromFunction1(getMetricResultsForDevice), getMetricResultsForMetric = js.Any.fromFunction1(getMetricResultsForMetric), getPrivatePayloadResult = js.Any.fromFunction1(getPrivatePayloadResult), measureAsync = js.Any.fromFunction0(measureAsync), metricResults = metricResults.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], numberOfProbesToAttempt = numberOfProbesToAttempt.asInstanceOf[js.Any], numberOfResultsPending = numberOfResultsPending.asInstanceOf[js.Any], privatePayloadResults = privatePayloadResults.asInstanceOf[js.Any], shouldRequestPrivatePayloads = shouldRequestPrivatePayloads.asInstanceOf[js.Any], timeoutInMilliseconds = timeoutInMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveQualityOfServiceMeasurement]
  }
  @scala.inline
  implicit class XboxLiveQualityOfServiceMeasurementOps[Self <: XboxLiveQualityOfServiceMeasurement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceAddresses(value: IVector[XboxLiveDeviceAddress]): Self = this.set("deviceAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetMetricResult(
      value: (XboxLiveDeviceAddress, XboxLiveQualityOfServiceMetric) => XboxLiveQualityOfServiceMetricResult
    ): Self = this.set("getMetricResult", js.Any.fromFunction2(value))
    @scala.inline
    def setGetMetricResultsForDevice(value: XboxLiveDeviceAddress => IVectorView[XboxLiveQualityOfServiceMetricResult]): Self = this.set("getMetricResultsForDevice", js.Any.fromFunction1(value))
    @scala.inline
    def setGetMetricResultsForMetric(value: XboxLiveQualityOfServiceMetric => IVectorView[XboxLiveQualityOfServiceMetricResult]): Self = this.set("getMetricResultsForMetric", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPrivatePayloadResult(value: XboxLiveDeviceAddress => XboxLiveQualityOfServicePrivatePayloadResult): Self = this.set("getPrivatePayloadResult", js.Any.fromFunction1(value))
    @scala.inline
    def setMeasureAsync(value: () => IPromiseWithIAsyncAction): Self = this.set("measureAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setMetricResults(value: IVectorView[XboxLiveQualityOfServiceMetricResult]): Self = this.set("metricResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetrics(value: IVector[XboxLiveQualityOfServiceMetric]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfProbesToAttempt(value: Double): Self = this.set("numberOfProbesToAttempt", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfResultsPending(value: Double): Self = this.set("numberOfResultsPending", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivatePayloadResults(value: IVectorView[XboxLiveQualityOfServicePrivatePayloadResult]): Self = this.set("privatePayloadResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldRequestPrivatePayloads(value: Boolean): Self = this.set("shouldRequestPrivatePayloads", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeoutInMilliseconds(value: Double): Self = this.set("timeoutInMilliseconds", value.asInstanceOf[js.Any])
  }
  
}

