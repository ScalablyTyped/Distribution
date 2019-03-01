package typings
package weappDashApiLib.weappDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("weapp-api", "wx")
@js.native
object wxNs extends js.Object {
  trait AccelerometerData extends js.Object {
    /** X 轴 */
    var x: scala.Double
    /** Y 轴 */
    var y: scala.Double
    /** Z 轴 */
    var z: scala.Double
  }
  
  // 帐号信息
  trait AccountInfo extends js.Object {
    //  插件帐号信息（仅在插件中调用时包含这一项）
    var Plugin: weappDashApiLib.Anon_AppIdVetsion
    //  小程序帐号信息
    var miniProgram: weappDashApiLib.Anon_AppId
  }
  
  trait ActionSheetOptions extends js.Object {
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    // 按钮的文字颜色
    var itemColor: js.UndefOr[java.lang.String] = js.undefined
    // 必填，按钮的文字数组，数组长度最大为 6
    var itemList: js.Array[java.lang.String]
    var success: js.UndefOr[ActionSheetSuccessCallback] = js.undefined
  }
  
  trait Animate extends js.Object {
    var args: js.Array[_]
    var `type`: java.lang.String
  }
  
  /** 动画实例可以调用以下方法来描述动画，调用结束后会返回自身，支持链式调用的写法。 */
  @js.native
  trait Animation extends js.Object {
    /** 颜色值 */
    def backgroundColor(color: java.lang.String): Animation = js.native
    /** 长度值，如果传入 Number 则默认使用 px，可传入其他自定义单位的长度值 */
    def bottom(length: scala.Double): Animation = js.native
    /**
      * 导出动画操作
      *
      * 注意: export 方法每次调用后会清掉之前的动画操作
      */
    def export(): Animator = js.native
    /** 长度值，如果传入 Number 则默认使用 px，可传入其他自定义单位的长度值 */
    def height(length: scala.Double): Animation = js.native
    /** 长度值，如果传入 Number 则默认使用 px，可传入其他自定义单位的长度值 */
    def left(length: scala.Double): Animation = js.native
    /**
      * 同transform-function matrix
      */
    def matrix(
      a: scala.Double,
      b: scala.Double,
      c: scala.Double,
      d: scala.Double,
      tx: scala.Double,
      ty: scala.Double
    ): Animation = js.native
    /** 同transform-function matrix3d */
    def matrix3d(
      a1: scala.Double,
      b1: scala.Double,
      c1: scala.Double,
      d1: scala.Double,
      a2: scala.Double,
      b2: scala.Double,
      c2: scala.Double,
      d2: scala.Double,
      a3: scala.Double,
      b3: scala.Double,
      c3: scala.Double,
      d3: scala.Double,
      a4: scala.Double,
      b4: scala.Double,
      c4: scala.Double,
      d4: scala.Double
    ): Animation = js.native
    /** 透明度，参数范围 0~1 */
    def opacity(value: scala.Double): Animation = js.native
    /** 长度值，如果传入 Number 则默认使用 px，可传入其他自定义单位的长度值 */
    def right(length: scala.Double): Animation = js.native
    /** deg的范围-180~180，从原点顺时针旋转一个deg角度 */
    def rotate(deg: scala.Double): Animation = js.native
    /** 同transform-function rotate3d */
    def rotate3d(x: scala.Double, y: scala.Double, z: scala.Double, deg: scala.Double): Animation = js.native
    /** deg的范围-180~180，在X轴旋转一个deg角度 */
    def rotateX(deg: scala.Double): Animation = js.native
    /** deg的范围-180~180，在Y轴旋转一个deg角度 */
    def rotateY(deg: scala.Double): Animation = js.native
    /** deg的范围-180~180，在Z轴旋转一个deg角度 */
    def rotateZ(deg: scala.Double): Animation = js.native
    /**
      * 一个参数时，表示在X轴、Y轴同时缩放sx倍数；
      * 两个参数时表示在X轴缩放sx倍数，在Y轴缩放sy倍数
      */
    def scale(sx: scala.Double): Animation = js.native
    def scale(sx: scala.Double, sy: scala.Double): Animation = js.native
    /** 在X轴缩放sx倍数，在Y轴缩放sy倍数，在Z轴缩放sz倍数 */
    def scale3d(sx: scala.Double, sy: scala.Double, sz: scala.Double): Animation = js.native
    /** 在X轴缩放sx倍数 */
    def scaleX(sx: scala.Double): Animation = js.native
    /** 在Y轴缩放sy倍数 */
    def scaleY(sy: scala.Double): Animation = js.native
    /** 在Z轴缩放sy倍数 */
    def scaleZ(sz: scala.Double): Animation = js.native
    /**
      * 参数范围-180~180；
      * 一个参数时，Y轴坐标不变，X轴坐标延顺时针倾斜ax度；
      * 两个参数时，分别在X轴倾斜ax度，在Y轴倾斜ay度
      */
    def skew(ax: scala.Double): Animation = js.native
    def skew(ax: scala.Double, ay: scala.Double): Animation = js.native
    /** 参数范围-180~180；Y轴坐标不变，X轴坐标延顺时针倾斜ax度 */
    def skewX(ax: scala.Double): Animation = js.native
    /** 参数范围-180~180；X轴坐标不变，Y轴坐标延顺时针倾斜ay度 */
    def skewY(ay: scala.Double): Animation = js.native
    /**
      * 调用动画操作方法后要调用 step() 来表示一组动画完成，
      * 可以在一组动画中调用任意多个动画方法，
      * 一组动画中的所有动画会同时开始，
      * 一组动画完成后才会进行下一组动画。
      * @param {CreateAnimationOptions} options 指定当前组动画的配置
      */
    def step(): scala.Unit = js.native
    def step(options: CreateAnimationOptions): scala.Unit = js.native
    /** 长度值，如果传入 Number 则默认使用 px，可传入其他自定义单位的长度值 */
    def top(length: scala.Double): Animation = js.native
    /**
      * 一个参数时，表示在X轴偏移tx，单位px；
      * 两个参数时，表示在X轴偏移tx，在Y轴偏移ty，单位px。
      */
    def translate(tx: scala.Double): Animation = js.native
    def translate(tx: scala.Double, ty: scala.Double): Animation = js.native
    /**
      * 在X轴偏移tx，在Y轴偏移ty，在Z轴偏移tz，单位px
      */
    def translate3d(tx: scala.Double, ty: scala.Double, tz: scala.Double): Animation = js.native
    /**
      * 在X轴偏移tx，单位px
      */
    def translateX(tx: scala.Double): Animation = js.native
    /**
      * 在Y轴偏移tx，单位px
      */
    def translateY(ty: scala.Double): Animation = js.native
    /**
      * 在Z轴偏移tx，单位px
      */
    def translateZ(tz: scala.Double): Animation = js.native
    /** 长度值，如果传入 Number 则默认使用 px，可传入其他自定义单位的长度值 */
    def width(length: scala.Double): Animation = js.native
  }
  
  trait AnimationAction extends js.Object {
    var animates: js.Array[Animate]
    var option: AnimationActionOption
  }
  
  trait AnimationActionOption extends js.Object {
    var transformOrigin: java.lang.String
    var transition: AnimationTransition
  }
  
  trait AnimationTransition extends js.Object {
    var delay: scala.Double
    var duration: scala.Double
    var timingFunction: TimingFunction
  }
  
  trait Animator extends js.Object {
    var actions: js.Array[AnimationAction]
  }
  
  trait AppOptions
    extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
    /** 小程序发生脚本错误或 API 调用报错时触发。也可以使用 wx.onError 绑定监听。*/
    var onError: js.UndefOr[ErrorCallback] = js.undefined
    /**
      * 生命周期函数--监听小程序隐藏
      * 当小程序从前台进入后台，会触发 onHide
      */
    var onHide: js.UndefOr[NoneParamCallback] = js.undefined
    /**
      * 生命周期函数--监听小程序初始化
      * 当小程序初始化完成时，会触发 onLaunch（全局只触发一次）
      */
    var onLaunch: js.UndefOr[onLaunchCallback] = js.undefined
    /**
      * 小程序要打开的页面不存在时触发
      * 1. 开发者可以在回调中进行页面重定向，但必须在回调中同步处理，异步处理（例如 setTimeout 异步执行）无效。
      * 2. 若开发者没有调用 wx.onPageNotFound 绑定监听，也没有声明 App.onPageNotFound，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
      * 3. 如果回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再第二次回调。
      */
    var onPageNotFound: js.UndefOr[NoneParamCallback] = js.undefined
    /**
      * 生命周期函数--监听小程序显示
      * 当小程序启动，或从后台进入前台显示，会触发 onShow
      */
    var onShow: js.UndefOr[js.Function1[/* options */ onShowOptions, scala.Unit]] = js.undefined
  }
  
  /**
    * 用户授权结果，参考 type Scope
    */
  trait AuthSetting extends js.Object {
    var `scope.address`: scala.Boolean
    var `scope.camera`: scala.Boolean
    var `scope.invoice`: scala.Boolean
    var `scope.invoiceTitle`: scala.Boolean
    var `scope.record`: scala.Boolean
    var `scope.userInfo`: scala.Boolean
    var `scope.userLocation`: scala.Boolean
    var `scope.werun`: scala.Boolean
    var `scope.writePhotosAlbum`: scala.Boolean
  }
  
  trait AuthorizeOptions extends CommonCallbackOptions {
    //  需要获取权限的 scope，详见 scope 列表
    var scope: Scope
  }
  
  trait BackgroundAudioPlayerState extends js.Object {
    /** 选定音频的播放位置（单位：s），只有在当前有音乐播放时返回 */
    var currentPosition: js.UndefOr[scala.Double] = js.undefined
    /** 歌曲数据链接，只有在当前有音乐播放时返回 */
    var dataUrl: js.UndefOr[java.lang.String] = js.undefined
    /** 音频的下载进度（整数，80 代表 80%），只有在当前有音乐播放时返回 */
    var downloadPercent: js.UndefOr[scala.Double] = js.undefined
    /** 选定音频的长度（单位：s），只有在当前有音乐播放时返回 */
    var duration: js.UndefOr[scala.Double] = js.undefined
    /** 播放状态（2：没有音乐在播放，1：播放中，0：暂停中） */
    var status: scala.Double
  }
  
  trait BackgroundColorOptions extends CommonCallbackOptions {
    // 窗口的背景色，必须为十六进制颜色值
    var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
    //  底部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
    var backgroundColorBottom: js.UndefOr[java.lang.String] = js.undefined
    // 顶部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
    var backgroundColorTop: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CameraDevice extends js.Object
  
  trait CanvasAction extends js.Object {
    var data: js.Array[CanvasAction] | (js.Array[scala.Double | java.lang.String])
    var method: java.lang.String
  }
  
  /**
    * context只是一个记录方法调用的容器，用于生成记录绘制行为的actions数组。context跟<canvas/>不存在对应关系，一个context生成画布的绘制动作数组可以应用于多个<canvas/>。
    */
  @js.native
  trait CanvasContext extends js.Object {
    /**
      * 添加一个弧形路径到当前路径，顺时针绘制。
      *
      * @param {number} x 矩形路径左上角的x坐标
      * @param {number} y 矩形路径左上角的y坐标
      * @param {number} radius 矩形路径左上角的y坐标
      * @param {number} startAngle 起始弧度
      * @param {number} endAngle 结束弧度
      * @param {boolean} sweepAngle 从起始弧度开始，扫过的弧度
      */
    def arc(
      x: scala.Double,
      y: scala.Double,
      radius: scala.Double,
      startAngle: scala.Double,
      endAngle: scala.Double,
      sweepAngle: scala.Boolean
    ): scala.Unit = js.native
    /**
      * 开始一个路径
      * 开始创建一个路径，需要调用fill或者stroke才会使用路径进行填充或描边。
      * 同一个路径内的多次setFillStyle、setStrokeStyle、setLineWidth等设置，
      * 以最后一次设置为准。
      */
    def beginPath(): scala.Unit = js.native
    /**
      * 创建三次方贝塞尔曲线
      *
      * @param {number} cp1x 第一个贝塞尔控制点的 x 坐标
      * @param {number} cp1y 第一个贝塞尔控制点的 y 坐标
      * @param {number} cp2x 第二个贝塞尔控制点的 x 坐标
      * @param {number} cp2y 第二个贝塞尔控制点的 y 坐标
      * @param {number} x 结束点的x坐标
      * @param {number} y 结束点的y坐标
      */
    def bezierCurveTo(
      cp1x: scala.Double,
      cp1y: scala.Double,
      cp2x: scala.Double,
      cp2y: scala.Double,
      x: scala.Double,
      y: scala.Double
    ): scala.Unit = js.native
    /** 清空当前的存储绘图动作 */
    def clearActions(): scala.Unit = js.native
    /**
      * 在给定的矩形区域内，清除画布上的像素
      * 清除画布上在该矩形区域内的内容。
      *
      * @param {number} x 矩形区域左上角的x坐标
      * @param {number} y 矩形区域左上角的y坐标
      * @param {number} width 矩形区域的宽度
      * @param {number} height 矩形区域的高度
      */
    def clearRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
    /**
      * 关闭一个路径
      */
    def closePath(): scala.Unit = js.native
    /**
      * 在画布上绘制图像
      * 绘制图像，图像保持原始尺寸。
      *
      * @param {string} imageResource 所要绘制的图片资源。 通过chooseImage得到一个文件路径或者一个项目目录内的图片
      * @param {number} x 图像左上角的x坐标
      * @param {number} y 图像左上角的y坐标
      */
    def drawImage(imageResource: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /**
      * 对当前路径进行填充
      */
    def fill(): scala.Unit = js.native
    /**
      * 在画布上绘制被填充的文本
      *
      * @param {string} text 在画布上输出的文本
      * @param {number} x 绘制文本的左上角x坐标位置
      * @param {number} y 绘制文本的左上角y坐标位置
      */
    def fillText(text: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /** 获取当前context上存储的绘图动作 */
    def getActions(): js.Array[CanvasAction] = js.native
    /**
      * 在当前位置添加一个新点，然后在画布中创建从该点到最后指定点的路径。
      *
      * @param {number} x 目标位置的x坐标
      * @param {number} y 目标位置的y坐标
      */
    def lineTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    /**
      * 把路径移动到画布中的指定点，但不创建线条。
      *
      * @param {number} x 目标位置的x坐标
      * @param {number} y 目标位置的y坐标
      */
    def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
    /**
      * 创建二次方贝塞尔曲线
      *
      * @param {number} cpx 贝塞尔控制点的x坐标
      * @param {number} cpy 贝塞尔控制点的y坐标
      * @param {number} x 结束点的x坐标
      * @param {number} y 结束点的y坐标
      */
    def quadraticCurveTo(cpx: scala.Double, cpy: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /**
      * 添加一个矩形路径到当前路径。
      *
      * @param {number} x 矩形路径左上角的x坐标
      * @param {number} y 矩形路径左上角的y坐标
      * @param {number} width 矩形路径的宽度
      * @param {number} height 矩形路径的高度
      */
    def rect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
    /**
      * 恢复之前保存过的坐标轴的缩放、旋转、平移信息
      */
    def restore(): scala.Unit = js.native
    /**
      * 对坐标轴进行顺时针旋转
      * 以原点为中心，原点可以用 translate方法修改。
      * 顺时针旋转当前坐标轴。多次调用rotate，旋转的角度会叠加。
      *
      * @param {number} rotate 旋转角度，以弧度计。
      */
    def rotate(rotate: scala.Double): scala.Unit = js.native
    /**
      * 保存当前坐标轴的缩放、旋转、平移信息
      */
    def save(): scala.Unit = js.native
    /**
      * 对横纵坐标进行缩放
      * 在调用scale方法后，之后创建的路径其横纵坐标会被缩放。
      * 多次调用scale，倍数会相乘。
      *
      * @param {number} scaleWidth 横坐标缩放的倍数
      * @param {number} scaleHeight 纵坐标轴缩放的倍数
      */
    def scale(scaleWidth: scala.Double): scala.Unit = js.native
    def scale(scaleWidth: scala.Double, scaleHeight: scala.Double): scala.Unit = js.native
    /**
      * 设置填充样式
      *
      * @param {string} color 设置为填充样式的颜色。'rgb(255, 0, 0)'或'rgba(255, 0, 0, 0.6)'或'#ff0000'格式的颜色字符串
      */
    def setFillStyle(color: java.lang.String): scala.Unit = js.native
    /**
      * 设置字体大小
      *
      * @param {number} fontSize 字体的字号
      */
    def setFontSize(fontSize: scala.Double): scala.Unit = js.native
    /**
      * 设置线条端点的样式
      *
      * @param {LineCapType} lineCap 线条的结束端点样式。 'butt'、'round'、'square'
      */
    def setLineCap(lineCap: LineCapType): scala.Unit = js.native
    /**
      * 设置两线相交处的样式
      *  @param {LineJoinType} lineJoin 两条线相交时，所创建的拐角类型
      */
    def setLineJoin(lineJoin: LineJoinType): scala.Unit = js.native
    /**
      * 设置线条宽度
      *
      * @param {number} lineWidth 线条的宽度
      */
    def setLineWidth(lineWidth: scala.Double): scala.Unit = js.native
    /** 设置最大斜接长度，斜接长度指的是在两条线交汇处内角和外角之间的距离。
      * 当 setLineJoin为 miter 时才有效。
      * 超过最大倾斜长度的，连接处将以 lineJoin 为 bevel 来显示
      *
      * @param {number} miterLimit 最大斜接长度
      */
    def setMiterLimit(miterLimit: scala.Double): scala.Unit = js.native
    /**
      * 设置阴影
      *
      * @param {number} offsetX 阴影相对于形状在水平方向的偏移
      * @param {number} offsetY 阴影相对于形状在竖直方向的偏移
      * @param {number} blur 阴影的模糊级别，数值越大越模糊 0~100
      * @param {string} color 阴影的颜色。 'rgb(255, 0, 0)'或'rgba(255, 0, 0, 0.6)'或'#ff0000'格式的颜色字符串
      */
    def setShadow(offsetX: scala.Double, offsetY: scala.Double, blur: scala.Double, color: java.lang.String): scala.Unit = js.native
    /**
      * 设置线条样式
      *
      * @param {string} color 设置为填充样式的颜色。'rgb(255, 0, 0)'或'rgba(255, 0, 0, 0.6)'或'#ff0000'格式的颜色字符串
      */
    def setStrokeStyle(color: java.lang.String): scala.Unit = js.native
    /**
      * 对当前路径进行描边
      */
    def stroke(): scala.Unit = js.native
    /**
      * 对坐标原点进行缩放
      * 对当前坐标系的原点(0, 0)进行变换，默认的坐标系原点为页面左上角。
      *
      * @param {number} x 水平坐标平移量
      * @param {number} y 竖直坐标平移量
      */
    def translate(x: scala.Double, y: scala.Double): scala.Unit = js.native
  }
  
  trait ChooseImageOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 最多可以选择的图片张数，默认9 */
    var count: js.UndefOr[scala.Double] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** original 原图，compressed 压缩图，默认二者都有 */
    var sizeType: js.UndefOr[js.Array[ImageSizeType]] = js.undefined
    /** album 从相册选图，camera 使用相机，默认二者都有 */
    var sourceType: js.UndefOr[js.Array[ImageSourceType]] = js.undefined
    /** 成功则返回图片的本地文件路径列表 tempFilePaths */
    def success(res: TempFilesData): scala.Unit
  }
  
  trait ChooseVideoOptions extends js.Object {
    /** 前置或者后置摄像头，默认为前后都有，即：['front', 'back'] */
    var camera: js.UndefOr[js.Array[CameraDevice]] = js.undefined
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 拍摄视频最长拍摄时间，单位秒。最长支持60秒 */
    var maxDuration: js.UndefOr[scala.Double] = js.undefined
    /** album 从相册选视频，camera 使用相机拍摄，默认为：['album', 'camera'] */
    var sourceType: js.UndefOr[js.Array[VideoSourceType]] = js.undefined
    /** 接口调用成功，返回视频文件的临时文件路径，详见返回参数说明 */
    var success: js.UndefOr[js.Function1[/* res */ VideoData, scala.Unit]] = js.undefined
  }
  
  /**
    * 公共回调函数
    */
  trait CommonCallbackOptions extends js.Object {
    //  接口调用结束的回调函数
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    //  接口调用失败回调函数
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    //  接口调用成功回调函数
    var success: js.UndefOr[ResponseCallback] = js.undefined
  }
  
  trait CompassData extends js.Object {
    /** 面对的方向度数 */
    var direction: scala.Double
  }
  
  //  WebSocket
  trait ConnectSocketOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 请求的数据 */
    var data: js.UndefOr[js.Any] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** HTTP Header , header 中不能设置 Referer */
    var header: js.UndefOr[RequestHeader] = js.undefined
    /** 默认是GET，有效值为： OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
    var method: js.UndefOr[java.lang.String] = js.undefined
    /** 接口调用成功的回调函数 */
    var success: js.UndefOr[ResponseCallback] = js.undefined
    /** 开发者服务器接口地址，必须是 HTTPS 协议，且域名必须是后台配置的合法域名 */
    var url: java.lang.String
  }
  
  // 动画
  trait CreateAnimationOptions extends js.Object {
    /** 动画持续时间，单位 ms，默认值 0 */
    var delay: js.UndefOr[scala.Double] = js.undefined
    /** 动画持续时间，单位ms，默认值 400 */
    var duration: js.UndefOr[scala.Double] = js.undefined
    /** 定义动画的效果，默认值"linear"，有效值："linear","ease","ease-in","ease-in-out","ease-out","step-start","step-end" */
    var timingFunction: js.UndefOr[TimingFunction] = js.undefined
    /** 设置transform-origin，默认为"50% 50% 0" */
    var transformOrigin: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait DataResponse extends js.Object {
    /** 回调函数返回的内容 */
    var data: js.Any
  }
  
  trait DownloadFileOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** HTTP 请求 Header */
    var header: js.UndefOr[RequestHeader] = js.undefined
    /** 下载成功后以 tempFilePath 的形式传给页面，res = {tempFilePath: '文件的临时路径'} */
    var success: js.UndefOr[TempFileResponseCallback] = js.undefined
    /** 下载资源的类型，用于客户端识别处理，有效值：image/audio/video */
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    /** 下载资源的 url */
    var url: java.lang.String
  }
  
  /**
    * 一个可以监听下载进度变化事件，以及取消下载任务的对象
    */
  trait DownloadTask extends js.Object {
    //  中断下载任务
    def abort(): scala.Unit
    //  取消监听 HTTP Response Header 事件
    def offHeadersReceived(callback: DataResponseCallback): scala.Unit
    //  取消监听下载进度变化事件
    def offProgressUpdate(callback: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]): scala.Unit
    //  监听 HTTP Response Header 事件。会比请求完成事件更早
    def onHeadersReceived(callback: DataResponseCallback): scala.Unit
    //  下载进度变化事件的回调函数
    def onProgressUpdate(callback: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]): scala.Unit
  }
  
  trait DrawCanvasOptions extends js.Object {
    /**
      * 绘图动作数组，由 wx.createContext 创建的 context，
      * 调用 getActions 方法导出绘图动作数组。
      */
    var actions: js.Array[CanvasAction]
    /** 画布标识，传入 <canvas/> 的 cavas-id */
    var canvasId: scala.Double | java.lang.String
  }
  
  trait FontDescOptions extends js.Object {
    //  字体样式，可选值为 normal / italic / oblique
    var style: js.UndefOr[java.lang.String] = js.undefined
    //  设置小型大写字母的字体显示文本，可选值为 normal / small-caps / inherit
    var variant: js.UndefOr[java.lang.String] = js.undefined
    //  字体粗细，可选值为 normal / bold / 100 / 200../ 900
    var weight: js.UndefOr[java.lang.String] = js.undefined
  }
  
  //  字体
  trait FontFaceOptions extends CommonCallbackOptions {
    //  可选的字体描述符
    var desc: js.UndefOr[FontDescOptions] = js.undefined
    //  定义的字体名称
    var family: java.lang.String
    //  字体资源的地址。建议格式为 TTF 和 WOFF，WOFF2 在低版本的iOS上会不兼容。
    var source: java.lang.String
  }
  
  trait GetBackgroundAudioPlayerStateOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[NoneParamCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[NoneParamCallback] = js.undefined
    /** 接口调用成功的回调函数 */
    var success: js.UndefOr[GetBackgroundAudioPlayerStateSuccessCallback] = js.undefined
  }
  
  trait GetCenterLocationSuccCbOptions extends CommonCallbackOptions {
    @JSName("success")
    def success_MGetCenterLocationSuccCbOptions(res: LocationBaseOptions): scala.Unit
  }
  
  trait GetLocationOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于wx.openLocation的坐标 */
    var `type`: js.UndefOr[
        weappDashApiLib.weappDashApiLibStrings.wgs84 | weappDashApiLib.weappDashApiLibStrings.gcj02
      ] = js.undefined
    /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
    def success(res: LocationData): scala.Unit
  }
  
  trait GetNetworkTypeOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用成功，返回网络类型 networkType */
    def success(res: NetworkTypeData): scala.Unit
  }
  
  trait GetReginOptions extends CommonCallbackOptions {
    @JSName("success")
    var success_GetReginOptions: js.UndefOr[
        js.Function1[
          /* callback */ js.Function1[/* res */ GetReginSuccessCallbackOptions, scala.Unit], 
          scala.Unit
        ]
      ] = js.undefined
  }
  
  trait GetReginSuccessCallbackOptions extends js.Object {
    //  东北角经纬度
    var northeast: scala.Double
    //  西南角经纬度
    var southwest: scala.Double
  }
  
  trait GetScaleOptions extends CommonCallbackOptions {
    @JSName("success")
    var success_GetScaleOptions: js.UndefOr[
        js.Function1[
          /* callback */ js.Function1[/* res */ weappDashApiLib.Anon_Scale, scala.Unit], 
          scala.Unit
        ]
      ] = js.undefined
  }
  
  @js.native
  trait GetStorageOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.native
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.native
    /** 本地缓存中的指定的 key */
    var key: java.lang.String = js.native
    /** 接口调用的回调函数,res = {data: key对应的内容} */
    @JSName("success")
    var success_Original: DataResponseCallback = js.native
    /** 接口调用的回调函数,res = {data: key对应的内容} */
    def success(res: DataResponse): scala.Unit = js.native
  }
  
  trait GetSystemInfoOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 成功获取系统信息的回调 */
    def success(res: SystemInfo): scala.Unit
  }
  
  trait GetUserInfoOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用成功的回调函数 */
    var success: js.UndefOr[js.Function1[/* res */ UserInfoResponse, scala.Unit]] = js.undefined
  }
  
  trait ImageSizeType extends js.Object
  
  trait ImageSourceType extends js.Object
  
  trait LineCapType extends js.Object
  
  trait LineJoinType extends js.Object
  
  trait LoadingOptions extends CommonCallbackOptions {
    //  默认false。是否显示透明蒙层，防止触摸穿透
    var mask: scala.Boolean
    // must，提示的内容
    var title: java.lang.String
  }
  
  // 媒体
  //  地图
  trait LocationBaseOptions extends js.Object {
    //  纬度，浮点数，范围为-90~90，负数表示南纬
    var latitude: scala.Double
    //  经度，浮点数，范围为-180~180，负数表示西经
    var longitude: scala.Double
  }
  
  trait LocationData extends js.Object {
    /** 位置的精确度 */
    var accuracy: scala.Double
    /** 纬度，浮点数，范围为-90~90，负数表示南纬 */
    var latitude: scala.Double
    /** 经度，浮点数，范围为-180~180，负数表示西经 */
    var longitude: scala.Double
    /** 速度，浮点数，单位m/s */
    var speed: scala.Double
  }
  
  trait LoginOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用成功的回调函数 */
    var success: js.UndefOr[js.Function1[/* res */ LoginResponse, scala.Unit]] = js.undefined
  }
  
  //  开放接口
  //  登录
  trait LoginResponse extends js.Object {
    /** 用户允许登录后，回调内容会带上 code（有效期五分钟），
      * 开发者需要将 code 发送到开发者服务器后台，
      * 使用code 换取 session_key api，
      * 将 code 换成 openid 和 session_key */
    var code: java.lang.String
    /** 调用结果 */
    var errMsg: java.lang.String
  }
  
  trait MapContext extends js.Object {
    //  获取当前地图中心的经纬度。返回的是 gcj02 坐标系，可以用于 wx.openLocation()
    def getCenterLocation(options: GetCenterLocationSuccCbOptions): scala.Unit
    //  获取当前地图的视野范围
    def getRegion(options: GetReginOptions): scala.Unit
    //  获取当前地图的缩放级别
    def getScale(options: GetScaleOptions): scala.Unit
    //  缩放视野展示所有经纬度
    def includePoints(options: zoomPointsOptions): scala.Unit
    //  将地图中心移动到当前定位点。需要配合map组件的show-location使用
    def moveToLocation(): scala.Unit
    //  平移marker，带动画
    def translateMarker(options: translateMarkerOptions): scala.Unit
  }
  
  trait ModalOptions extends CommonCallbackOptions {
    //  取消按钮的文字颜色，必须是 16 进制格式的颜色字符串，默认值'#000000'
    var cancelColor: js.UndefOr[java.lang.String] = js.undefined
    //  取消按钮的文字，最多 4 个字符，默认值'取消'
    var cancelText: js.UndefOr[java.lang.String] = js.undefined
    //  确认按钮的文字颜色，必须是 16 进制格式的颜色字符串，默认值'#3cc51f'
    var confirmColor: js.UndefOr[scala.Boolean] = js.undefined
    //  确认按钮的文字，最多 4 个字符
    var confirmText: js.UndefOr[java.lang.String] = js.undefined
    // 提示的内容
    var content: java.lang.String
    //  是否显示取消按钮，默认值true
    var showCancel: js.UndefOr[scala.Boolean] = js.undefined
    // 提示的内容
    var title: java.lang.String
  }
  
  trait NavigateBackMiniProgramOptions extends CommonCallbackOptions {
    //  需要返回给上一个小程序的数据，上一个小程序可在 App.onShow 中获取到这份数据。
    var extraData: js.Object
  }
  
  trait NavigateBackOptions extends CommonCallbackOptions {
    //  返回的页面数，如果 delta 大于现有页面数，则返回到首页。
    var delta: scala.Double
  }
  
  trait NavigateToMiniProgramOptions extends CommonCallbackOptions {
    //  要打开的小程序 appId
    var appId: java.lang.String
    //  要打开的小程序版本。仅在当前小程序为开发版或体验版时此参数有效。如果当前小程序是正式版，则打开的小程序必定是正式版。
    var envVersion: js.UndefOr[envVersion] = js.undefined
    //  需要传递给目标小程序的数据，目标小程序可在 App.onLaunch，App.onShow 中获取到这份数据。
    var extraData: js.UndefOr[js.Object] = js.undefined
    //  打开的页面路径，如果为空则打开首页
    var path: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait NavigationBarColorAnimationOptions extends js.Object {
    //  动画变化时间，单位 ms，默认0
    var animation: js.UndefOr[scala.Double] = js.undefined
    //  动画变化方式.动画从头到尾的速度是相同的,动画以低速开始,动画以低速结束,动画以低速开始和结束
    var timingFunc: js.UndefOr[
        weappDashApiLib.weappDashApiLibStrings.linear | weappDashApiLib.weappDashApiLibStrings.easeIn | weappDashApiLib.weappDashApiLibStrings.easeOut | weappDashApiLib.weappDashApiLibStrings.easeInOut
      ] = js.undefined
  }
  
  trait NavigationBarColorOptions extends CommonCallbackOptions {
    //  动画效果
    var animation: NavigationBarColorAnimationOptions
    // 背景颜色值，有效值为十六进制颜色
    var backgroundColor: java.lang.String
    // 前景颜色值，包括按钮、标题、状态栏的颜色，仅支持 #ffffff 和 #000000
    var frontColor: java.lang.String
  }
  
  trait NavigationBarTitleOptions extends CommonCallbackOptions {
    //  动态设置当前页面的标题
    var title: java.lang.String
  }
  
  trait NetworkTypeData extends js.Object {
    /** 返回网络类型2g，3g，4g，wifi */
    var networkType: weappDashApiLib.weappDashApiLibStrings.`2g` | weappDashApiLib.weappDashApiLibStrings.`3g` | weappDashApiLib.weappDashApiLibStrings.`4g` | weappDashApiLib.weappDashApiLibStrings.wifi
  }
  
  //  下载
  trait OnProgressCallbackOptions extends js.Object {
    //  下载进度百分比
    var progress: scala.Double
    //  预期需要下载的数据总长度，单位 Bytes
    var totalBytesExpectedToWrite: scala.Double
    //  已经下载的数据长度，单位 Bytes
    var totalBytesWritten: scala.Double
  }
  
  trait OpenLocationOptions extends js.Object {
    /** 地址的详细说明 */
    var address: js.UndefOr[java.lang.String] = js.undefined
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 纬度，范围为-90~90，负数表示南纬 */
    var latitude: scala.Double
    /** 经度，范围为-180~180，负数表示西经 */
    var longitude: scala.Double
    /** 位置名 */
    var name: js.UndefOr[java.lang.String] = js.undefined
    /** 缩放比例，范围1~28，默认为28 */
    var scale: js.UndefOr[scala.Double] = js.undefined
    /** 接口调用成功的回调函数 */
    var success: js.UndefOr[ResponseCallback] = js.undefined
  }
  
  trait PageOptions
    extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
    /** 页面的初始数据 */
    var data: js.UndefOr[js.Any] = js.undefined
    /** 生命周期函数--监听页面隐藏 */
    var onHide: js.UndefOr[NoneParamCallback] = js.undefined
    /** 生命周期函数--监听页面加载 */
    var onLoad: js.UndefOr[js.Function1[/* options */ js.Any, scala.Unit]] = js.undefined
    /** 生命周期函数--监听页面渲染完成 */
    var onReady: js.UndefOr[NoneParamCallback] = js.undefined
    /** 生命周期函数--监听页面显示 */
    var onShow: js.UndefOr[NoneParamCallback] = js.undefined
    /** 生命周期函数--监听页面卸载 */
    var onUnload: js.UndefOr[NoneParamCallback] = js.undefined
  }
  
  //  滚动
  trait PageScrollToOptions extends CommonCallbackOptions {
    //  滚动动画的时长，单位 ms。默认300
    var duration: scala.Double
    //  滚动到页面的目标位置，单位 px
    var scrollTop: scala.Double
  }
  
  trait PlayBackgroundAudioOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 封面URL */
    var coverImgUrl: js.UndefOr[java.lang.String] = js.undefined
    /** 音乐链接 */
    var dataUrl: java.lang.String
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用成功的回调函数 */
    var success: js.UndefOr[ResponseCallback] = js.undefined
    /** 音乐标题 */
    var title: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait PlayVoiceOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 需要播放的语音文件的文件路径 */
    var filePath: java.lang.String
    /** 接口调用成功的回调函数 */
    var success: js.UndefOr[ResponseCallback] = js.undefined
  }
  
  trait PreviewImageOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 当前显示图片的链接，不填则默认为 urls 的第一张 */
    var current: js.UndefOr[java.lang.String] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用成功的回调函数 */
    var success: js.UndefOr[ResponseCallback] = js.undefined
    /** 需要预览的图片链接列表 */
    var urls: js.Array[java.lang.String]
  }
  
  //  网络
  //  发起请求
  trait RequestHeader
    extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  trait RequestOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 请求的参数 */
    var data: js.UndefOr[java.lang.String | js.Any] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 设置请求的 header , header 中不能设置 Referer */
    var header: js.UndefOr[RequestHeader] = js.undefined
    /** 默认为 GET，有效值：OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
    var method: js.UndefOr[java.lang.String] = js.undefined
    /** 收到开发者服务成功返回的回调函数，res = {data: '开发者服务器返回的内容'} */
    var success: js.UndefOr[DataResponseCallback] = js.undefined
    /** 开发者服务器接口地址 */
    var url: java.lang.String
  }
  
  trait RequestPaymentOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 随机字符串，长度为32个字符以下。 */
    var nonceStr: java.lang.String
    /** 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=* */
    var `package`: java.lang.String
    /** 签名,具体签名方案参见微信公众号支付帮助文档; */
    var paySign: java.lang.String
    /** 签名算法，暂支持 MD5 */
    var signType: PaymentSignType
    /** 接口调用成功的回调函数 */
    var success: js.UndefOr[ResponseCallback] = js.undefined
    /** 时间戳从1970年1月1日00:00:00至今的秒数,即当前的时间 */
    var timeStamp: java.lang.String | scala.Double
  }
  
  /**
    * 网络请求任务对象
    */
  trait RequestTask extends js.Object {
    //  中断请求任务
    def abort(): scala.Unit
    //  取消监听 HTTP Response Header 事件
    def offHeadersReceived(callback: DataResponseCallback): scala.Unit
    //  监听 HTTP Response Header 事件。会比请求完成事件更早
    def onHeadersReceived(callback: DataResponseCallback): scala.Unit
  }
  
  trait SaveFileOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 返回文件的保存路径，res = {savedFilePath: '文件的保存路径'} */
    var success: js.UndefOr[js.Function1[/* res */ SavedFileData, scala.Unit]] = js.undefined
    /** 需要保存的文件的临时路径 */
    var tempFilePath: java.lang.String
  }
  
  trait SavedFileData extends js.Object {
    /** 文件的保存路径 */
    var savedFilePath: java.lang.String
  }
  
  trait Scope extends js.Object
  
  trait SeekBackgroundAudioOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 音乐位置，单位：秒 */
    var position: scala.Double
    /** 接口调用成功的回调函数 */
    var success: js.UndefOr[ResponseCallback] = js.undefined
  }
  
  trait SendSocketMessageOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /**	需要发送的内容 */
    var data: java.lang.String
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用成功的回调函数 */
    var success: js.UndefOr[ResponseCallback] = js.undefined
  }
  
  trait SetNavigationBarTitleOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 成功获取系统信息的回调 */
    var success: js.UndefOr[ResponseCallback] = js.undefined
    /** 页面标题 */
    var title: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait SetStorageOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 需要存储的内容 */
    var data: js.Any | java.lang.String
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 本地缓存中的指定的 key */
    var key: java.lang.String
    /** 接口调用成功的回调函数 */
    var success: js.UndefOr[ResponseCallback] = js.undefined
  }
  
  // 设置
  trait SettingOptions extends CommonCallbackOptions {
    @JSName("success")
    var success_SettingOptions: js.UndefOr[js.Function1[/* res */ AuthSetting, scala.Unit]] = js.undefined
  }
  
  trait StartRecordOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 录音成功后调用，返回录音文件的临时文件路径，res = {tempFilePath: '录音文件的临时路径'} */
    var success: js.UndefOr[TempFileResponseCallback] = js.undefined
  }
  
  // 数据缓存
  trait StorageInfo extends js.Object {
    //  当前占用的空间大小, 单位 KB
    var currentSize: scala.Double
    //  当前 storage 中所有的 key
    var keys: js.Array[java.lang.String]
    //  限制的空间大小，单位 KB
    var limitSize: scala.Double
  }
  
  trait StorageInfoOptions extends CommonCallbackOptions {
    @JSName("success")
    var success_StorageInfoOptions: js.UndefOr[StorageInfoCallback] = js.undefined
  }
  
  trait SystemInfo extends js.Object {
    /** 微信设置的语言 */
    var language: java.lang.String
    /** 手机型号 */
    var model: java.lang.String
    /** 设备像素比 */
    var pixelRatio: scala.Double
    /** 微信版本号 */
    var version: java.lang.String
    /** 窗口高度 */
    var windowHeight: scala.Double
    /** 窗口宽度 */
    var windowWidth: scala.Double
  }
  
  trait TabBarAnimationOptions extends CommonCallbackOptions {
    //  是否需要动画效果
    var animation: scala.Boolean
  }
  
  trait TabBarBadgeOptions extends CommonCallbackOptions {
    //  tabBar 的哪一项，从左边算起
    var index: scala.Double
    //  显示的文本，超过 4 个字符则显示成 ...
    var text: java.lang.String
  }
  
  //  Tab Bar
  trait TabBarItemOptions extends CommonCallbackOptions {
    //  图片路径，icon 大小限制为 40kb，建议尺寸为 81px * 81px，当 postion 为 top 时，此参数无效，不支持网络图片
    var iconPath: js.UndefOr[java.lang.String] = js.undefined
    //  tabBar 的哪一项，从左边算起
    var index: scala.Double
    //  选中时的图片路径，icon 大小限制为 40kb，建议尺寸为 81px * 81px ，当 postion 为 top 时，此参数无效
    var selectedIconPath: js.UndefOr[java.lang.String] = js.undefined
    //  tab 上的按钮文字
    var text: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait TabBarRedDotOptions extends CommonCallbackOptions {
    //  tabBar 的哪一项，从左边算起
    var index: scala.Double
  }
  
  trait TabBarStyleOptions extends CommonCallbackOptions {
    //  tab 的背景色，HexColor
    var backgroundColor: java.lang.String
    //  tabBar上边框的颜色， 仅支持 black/white
    var borderStyle: java.lang.String
    //  tab 上的文字默认颜色，HexColor
    var color: java.lang.String
    //  tab 上的文字选中时的颜色，HexColor
    var selectedColor: java.lang.String
  }
  
  trait TempFileResponse extends js.Object {
    /** 文件的临时路径 */
    var tempFilePath: java.lang.String
  }
  
  trait TempFilesData extends js.Object {
    /** 文件的临时路径 */
    var tempFilePaths: java.lang.String
  }
  
  trait TimingFunction extends js.Object
  
  trait ToastOptions extends CommonCallbackOptions {
    //  提示的延迟时间，默认值1500ms
    var duration: js.UndefOr[scala.Double] = js.undefined
    // 图标，默认值'success'
    var icon: js.UndefOr[icon] = js.undefined
    //  自定义图标的本地路径，image 的优先级高于 icon
    var imgage: js.UndefOr[java.lang.String] = js.undefined
    //  是否显示透明蒙层，防止触摸穿透，默认值false
    var mask: scala.Boolean
    // 提示的内容
    var title: java.lang.String
  }
  
  trait UpdateManager extends js.Object {
    /**
      * 强制小程序重启并使用新版本。在小程序新版本下载完成后（即收到 onUpdateReady 回调）调用。
      */
    def applyUpdate(callback: DataResponseCallback): scala.Unit
    /**
      * 监听向微信后台请求检查更新结果事件。微信在小程序冷启动时自动检查更新，不需由开发者主动触发。
      */
    def onCheckForUpdate(): scala.Unit
    /**
      * 监听小程序更新失败事件。小程序有新版本，客户端主动触发下载（无需开发者触发），下载失败（可能是网络原因等）后回调
      */
    def onUpdateFailed(callback: NoneParamCallback): scala.Unit
    /**
      * 监听小程序有版本更新事件。客户端主动触发下载（无需开发者触发），下载成功后回调
      */
    def onUpdateReady(callback: NoneParamCallback): scala.Unit
  }
  
  trait UploadFileOptions extends js.Object {
    /** 接口调用结束的回调函数（调用成功、失败都会执行） */
    var complete: js.UndefOr[ResponseCallback] = js.undefined
    /** 接口调用失败的回调函数 */
    var fail: js.UndefOr[ResponseCallback] = js.undefined
    /** 要上传文件资源的路径 */
    var filePath: java.lang.String
    /** HTTP 请求中其他额外的 form data */
    var formData: js.UndefOr[js.Any] = js.undefined
    /** HTTP 请求 Header , header 中不能设置 Referer */
    var header: js.UndefOr[RequestHeader] = js.undefined
    /** 文件对应的 key , 开发者在服务器端通过这个 key 可以获取到文件二进制内容 */
    var name: java.lang.String
    /** 接口调用成功的回调函数 */
    var success: js.UndefOr[ResponseCallback] = js.undefined
    /** 开发者服务器 url */
    var url: java.lang.String
  }
  
  // 上传
  /**
    * 一个可以监听上传进度变化事件，以及取消上传任务的对象
    */
  trait UploadTask extends js.Object {
    //  中断上传任务
    def abort(): scala.Unit
    //  取消监听 HTTP Response Header 事件
    def offHeadersReceived(callback: DataResponseCallback): scala.Unit
    //  取消监听上传进度变化事件
    def offProgressUpdate(callback: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]): scala.Unit
    //  监听 HTTP Response Header 事件。会比请求完成事件更早
    def onHeadersReceived(callback: DataResponseCallback): scala.Unit
    //  上传进度变化事件的回调函数
    def onProgressUpdate(callback: js.Function1[/* res */ OnProgressCallbackOptions, js.Object]): scala.Unit
  }
  
  //  帐号信息
  trait UserInfo extends js.Object {
    var avatarUrl: java.lang.String
    var city: java.lang.String
    var country: java.lang.String
    var gender: scala.Double
    var nickName: java.lang.String
    var province: java.lang.String
  }
  
  trait UserInfoResponse extends js.Object {
    /** 包括敏感数据在内的完整用户信息的加密数据，详细见加密数据解密算法 */
    var encryptData: java.lang.String
    /** 不包括敏感信息的原始数据字符串，用于计算签名。 */
    var rawData: java.lang.String
    /** 使用 sha1( rawData + sessionkey ) 得到字符串，用于校验用户信息。 */
    var signature: java.lang.String
    /** 用户信息对象，不包含 openid 等敏感信息 */
    var userInfo: UserInfo
  }
  
  trait VideoData extends js.Object {
    /** 选定视频的时间长度 */
    var duration: scala.Double
    /** 返回选定视频的长 */
    var height: scala.Double
    /** 选定视频的数据量大小 */
    var size: scala.Double
    /** 选定视频的临时文件路径 */
    var tempFilePath: java.lang.String
    /** 返回选定视频的宽 */
    var width: scala.Double
  }
  
  trait VideoSourceType extends js.Object
  
  trait envVersion extends js.Object
  
  trait icon extends js.Object
  
  trait onLaunchOptions extends js.Object {
    /** 启动小程序的路径 */
    var path: java.lang.String
    /** 启动小程序的query参数 */
    var query: js.Object
    /** 来源信息。从另一个小程序、公众号或App进入小程序时返回。范泽返回{} */
    var referrerInfo: referrerInfo
    /** 启动小程序的场景值 */
    var scene: scala.Double
    var shareTicket: java.lang.String
  }
  
  trait referrerInfo extends js.Object {
    /** 来源小程序、公众号或 App 的 appId */
    var appId: java.lang.String
    /** 来源小程序传过来的数据，scene=1037或1038时支持 */
    var extraData: js.Object
  }
  
  //  调试  TODO
  // 路由
  trait routerOptions extends CommonCallbackOptions {
    //  需要跳转的应用内非 tabBar 的页面的路径, 路径后可以带参数。参数与路径之间使用 ? 分隔，参数键与参数值用 = 相连，不同参数用 & 分隔；如 'path?key=value&key2=value2'
    var url: java.lang.String
  }
  
  trait translateMarkerOptions extends CommonCallbackOptions {
    //  动画结束回调函数
    var animationEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
    //  移动过程中是否自动旋转 marker
    var autoRotate: scala.Boolean
    //  指定 marker 移动到的目标点
    var destination: LocationBaseOptions
    //  动画持续时长，平移与旋转分别计算
    var duration: js.UndefOr[scala.Double] = js.undefined
    //  指定 marker
    var markerId: scala.Double
    //  marker 的旋转角度
    var rotate: scala.Double
  }
  
  trait zoomPointsOptions extends CommonCallbackOptions {
    //  坐标点形成的矩形边缘到地图边缘的距离，单位像素。格式为[上,右,下,左]，安卓上只能识别数组第一项，上下左右的padding一致。开发者工具暂不支持padding参数。
    var padding: js.UndefOr[js.Array[scala.Double]] = js.undefined
    //  要显示在可视区域内的坐标点列表
    var points: js.Array[LocationBaseOptions]
  }
  
  /**
    * 提前向用户发起授权请求。调用后会立刻弹窗询问用户是否同意授权小程序使用某项功能或获取用户的某些数据，但不会实际调用对应接口。如果用户之前已经同意授权，则不会出现弹窗，直接返回成功。
    */
  def authorize(options: AuthorizeOptions): scala.Unit = js.native
  /**
    *  检查登录态是否过期。
    */
  def checkSession(options: CommonCallbackOptions): scala.Unit = js.native
  /**
    * 从本地相册选择图片或使用相机拍照。
    */
  def chooseImage(options: ChooseImageOptions): scala.Unit = js.native
  /**
    * 拍摄视频或从手机相册中选视频，返回视频的临时文件路径。
    */
  def chooseVideo(options: ChooseVideoOptions): scala.Unit = js.native
  /**
    * 清理本地数据缓存。
    */
  def clearStorage(): scala.Unit = js.native
  /**
    * 同步清理本地数据缓存
    */
  def clearStorageSync(): scala.Unit = js.native
  /**
    * 关闭WebSocket连接。
    */
  def closeSocket(): scala.Unit = js.native
  /**
    * 创建一个 WebSocket 连接；
    * 一个微信小程序同时只能有一个 WebSocket 连接，
    * 如果当前已存在一个 WebSocket 连接，
    * 会自动关闭该连接，并重新创建一个 WebSocket 连接。
    */
  def connectSocket(options: ConnectSocketOptions): scala.Unit = js.native
  /**
    * 创建一个动画实例animation。调用实例的方法来描述动画。
    * 最后通过动画实例的export方法导出动画数据传递给组件的animation属性。
    *
    * 注意: export 方法每次调用后会清掉之前的动画操作
    */
  def createAnimation(): Animation = js.native
  def createAnimation(options: CreateAnimationOptions): Animation = js.native
  /**
    * 创建并返回绘图上下文context对象。
    * context只是一个记录方法调用的容器，
    * 用于生成记录绘制行为的actions数组。c
    * ontext跟<canvas/>不存在对应关系，
    * 一个context生成画布的绘制动作数组可以应用于多个<canvas/>。
    */
  def createContext(): CanvasContext = js.native
  /**
    * 下载文件资源到本地。客户端直接发起一个 HTTP GET 请求，
    * 把下载到的资源根据 type 进行处理，并返回文件的本地临时路径。
    */
  def downloadFile(options: DownloadFileOptions): DownloadTask = js.native
  /**
    * 绘制画布
    */
  def drawCanvas(options: DrawCanvasOptions): scala.Unit = js.native
  /**
    * 获取当前账号信息
    */
  def getAccountInfoSync(): AccountInfo = js.native
  /** 获取音乐播放状态。 */
  def getBackgroundAudioPlayerState(options: GetBackgroundAudioPlayerStateOptions): scala.Unit = js.native
  /**
    * 获取小程序启动时的参数。与 App.onLaunch 的回调参数一致。
    */
  def getLaunchOptionsSync(): onLaunchCallback = js.native
  /**
    * 获取当前的地理位置、速度。
    */
  def getLocation(options: GetLocationOptions): scala.Unit = js.native
  /**
    * 获取网络类型。
    */
  def getNetworkType(options: GetNetworkTypeOptions): scala.Unit = js.native
  /**
    * 获取用户的当前设置。返回值中只会出现小程序已经向用户请求过的权限。
    */
  def getSetting(options: SettingOptions): scala.Unit = js.native
  /**
    * 从本地缓存中异步获取指定 key 对应的内容。
    */
  def getStorage(options: GetStorageOptions): scala.Unit = js.native
  /**
    * 异步获取当前storage的相关信息
    * @param options
    */
  def getStorageInfo(options: StorageInfoOptions): scala.Unit = js.native
  /**
    * getStorageInfo的同步版本
    */
  def getStorageInfoSync(): StorageInfo = js.native
  /**
    * 从本地缓存中同步获取指定 key 对应的内容。
    *
    * @param {string} key
    * @returns {(Object | string)}
    */
  def getStorageSync(key: java.lang.String): js.Any | java.lang.String = js.native
  /**
    * 获取系统信息。
    */
  def getSystemInfo(options: GetSystemInfoOptions): scala.Unit = js.native
  /**
    * 获取全局唯一的版本更新管理器，用于管理小程序更新。关于小程序的更新机制，可以查看运行机制文档。
    */
  def getUpdateManager(): UpdateManager = js.native
  /**
    * 获取用户信息，需要先调用 wx.login 接口。
    */
  def getUserInfo(options: GetUserInfoOptions): scala.Unit = js.native
  /**
    * 收起键盘。
    */
  def hideKeyboard(): scala.Unit = js.native
  /**
    * 隐藏 loading 提示框
    * @param options
    */
  def hideLoading(): scala.Unit = js.native
  def hideLoading(options: CommonCallbackOptions): scala.Unit = js.native
  /**
    * 在当前页面隐藏导航条加载动画
    */
  /**
    * 隐藏导航条加载动画。
    */
  def hideNavigationBarLoading(): scala.Unit = js.native
  def hideNavigationBarLoading(options: CommonCallbackOptions): scala.Unit = js.native
  /**
    * 隐藏tabBar
    */
  def hideTabBar(options: TabBarAnimationOptions): scala.Unit = js.native
  /**
    * 隐藏 tabBar 某一项的右上角的红点
    * @param options
    */
  def hideTabBarRedDot(options: TabBarBadgeOptions): scala.Unit = js.native
  /**
    * 隐藏消息提示框
    * @param options
    */
  def hideToast(): scala.Unit = js.native
  def hideToast(options: CommonCallbackOptions): scala.Unit = js.native
  def loadFontFace(options: FontFaceOptions): scala.Unit = js.native
  /**
    * 调用接口获取登录凭证（code）进而换取用户登录态信息，
    * 包括用户的唯一标识（openid） 及本次登录的 会话密钥（session_key）。
    * 用户数据的加解密通讯需要依赖会话密钥完成。
    */
  def login(option: LoginOptions): scala.Unit = js.native
  /**
    * 关闭当前页面，返回上一页面或多级页面。可通过 getCurrentPages() 获取当前的页面栈，决定需要返回几层。
    */
  def navigateBack(options: NavigateBackOptions): scala.Unit = js.native
  /**
    * 返回到上一个小程序。只有在当前小程序是被其他小程序打开时可以调用成功
    */
  def navigateBackMiniProgram(options: NavigateBackMiniProgramOptions): scala.Unit = js.native
  /**
    * 保留当前页面，跳转到应用内的某个页面。但是不能跳到 tabbar 页面。使用 wx.navigateBack 可以返回到原页面。
    * @param options
    */
  def navigateTo(options: routerOptions): scala.Unit = js.native
  /**
    * 打开另一个小程序
    */
  def navigateToMiniProgram(options: NavigateToMiniProgramOptions): scala.Unit = js.native
  /**
    * 取消监听小程序切后台事件
    */
  def offAppHide(): NoneParamCallback = js.native
  /**
    *  取消监听小程序切前台事件
    */
  def offAppShow(): NoneParamCallback = js.native
  /**
    * 取消监听小程序错误事件。
    */
  def offError(): NoneParamCallback = js.native
  // 应用级事件
  /**
    * 取消监听小程序要打开的页面不存在事件
    */
  def offPageNotFound(): NoneParamCallback = js.native
  /**
    * 监听重力感应数据，频率：5次/秒
    */
  def onAccelerometerChange(callback: AccelerometerChangeCallback): scala.Unit = js.native
  /**
    * 监听小程序切后台事件。该事件与 App.onHide 的回调时机一致。
    */
  def onAppHide(): NoneParamCallback = js.native
  /**
    * 监听小程序切前台事件。该事件与 App.onShow 的回调参数一致。
    * @param callback
    */
  def onAppShow(callback: onShowOptions): scala.Unit = js.native
  /** 监听音乐暂停。 */
  def onBackgroundAudioPause(callback: NoneParamCallback): scala.Unit = js.native
  /** 监听音乐播放。 */
  def onBackgroundAudioPlay(callback: NoneParamCallback): scala.Unit = js.native
  /** 监听音乐停止。 */
  def onBackgroundAudioStop(callback: NoneParamCallback): scala.Unit = js.native
  def onCompassChange(callback: CompassChangeCallback): scala.Unit = js.native
  /**
    * 监听小程序错误事件。如脚本错误或 API 调用报错等。该事件与 App.onError 的回调时机与参数一致。
    */
  def onError(): ErrorCallback = js.native
  /**
    * 监听小程序要打开的页面不存在事件。该事件与 App.onPageNotFound 的回调时机一致。
    */
  def onPageNotFound(): NoneParamCallback = js.native
  /** 监听WebSocket关闭。 */
  def onSocketClose(callback: ResponseCallback): scala.Unit = js.native
  /** 监听WebSocket错误。 */
  def onSocketError(callback: ErrorCallback): scala.Unit = js.native
  /**
    * 监听WebSocket接受到服务器的消息事件。
    */
  def onSocketMessage(callback: DataResponseCallback): scala.Unit = js.native
  /** 监听WebSocket连接打开事件。 */
  def onSocketOpen(callback: OneParamCallback): scala.Unit = js.native
  /**
    * 使用微信内置地图查看位置
    */
  def openLocation(options: OpenLocationOptions): scala.Unit = js.native
  /**
    * 调起客户端小程序设置界面，返回用户设置的操作结果。设置界面只会出现小程序已经向用户请求过的权限。
    */
  def openSetting(options: SettingOptions): scala.Unit = js.native
  /**
    * 将页面滚动到
    */
  def pageScrollTo(): scala.Unit = js.native
  /** 暂停播放音乐。 */
  def pauseBackgroundAudio(): scala.Unit = js.native
  /**
    * 暂停正在播放的语音。
    * 再次调用wx.playVoice播放同一个文件时，会从暂停处开始播放。
    * 如果想从头开始播放，需要先调用 wx.stopVoice。
    */
  def pauseVoice(): scala.Unit = js.native
  /** 播放音乐，同时只能有一首音乐正在播放。 */
  def playBackgroundAudio(options: PlayBackgroundAudioOptions): scala.Unit = js.native
  /**
    * 开始播放语音，同时只允许一个语音文件正在播放，
    * 如果前一个语音文件还没播放完，将中断前一个语音播放。
    */
  def playVoice(options: PlayVoiceOptions): scala.Unit = js.native
  /**
    * 预览图片。
    */
  def previewImage(options: PreviewImageOptions): scala.Unit = js.native
  /**
    * 关闭所有页面，打开到应用内的某个页面
    */
  def reLaunch(options: routerOptions): scala.Unit = js.native
  /**
    * 关闭当前页面，跳转到应用内的某个页面。但是不允许跳转到 tabbar 页面。
    */
  def redirectTo(options: routerOptions): scala.Unit = js.native
  /**
    * 移除 tabBar 某一项右上角的文本
    * @param options
    */
  def removeTabBarBadge(options: TabBarRedDotOptions): scala.Unit = js.native
  /**
    * wx.request发起的是https请求。一个微信小程序，同时只能有5个网络请求连接。
    */
  def request(options: RequestOptions): RequestTask = js.native
  //  支付
  /**
    * 发起微信支付。
    */
  def requestPayment(options: RequestPaymentOptions): scala.Unit = js.native
  /**
    * 保存文件到本地。
    */
  def saveFile(options: SaveFileOptions): scala.Unit = js.native
  /**
    * 控制音乐播放进度。
    */
  def seekBackgroundAudio(options: SeekBackgroundAudioOptions): scala.Unit = js.native
  /**
    * 通过 WebSocket 连接发送数据，需要先 wx.connectSocket，
    * 并在 wx.onSocketOpen 回调之后才能发送。
    */
  def sendSocketMessage(options: SendSocketMessageOptions): scala.Unit = js.native
  def setBackgroundColor(): scala.Unit = js.native
  //  背景
  def setBackgroundTextStyle(): scala.Unit = js.native
  // 导航栏
  def setNavigationBarColor(): scala.Unit = js.native
  /**
    * 动态设置当前页面的标题
    * @param options
    */
  def setNavigationBarTitle(options: NavigationBarTitleOptions): scala.Unit = js.native
  /**
    * 动态设置当前页面的标题。
    */
  def setNavigationBarTitle(options: SetNavigationBarTitleOptions): scala.Unit = js.native
  /**
    * 将数据存储在本地缓存中指定的 key 中，
    * 会覆盖掉原来该 key 对应的内容，这是一个异步接口。
    */
  def setStorage(options: SetStorageOptions): scala.Unit = js.native
  def setStorageSync(key: java.lang.String, data: java.lang.String): scala.Unit = js.native
  /**
    * 将 data 存储在本地缓存中指定的 key 中，
    * 会覆盖掉原来该 key 对应的内容，这是一个同步接口。
    *
    * @param {string} key 本地缓存中的指定的 key
    * @param {(Object | string)} data 需要存储的内容
    */
  def setStorageSync(key: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
    * 为 tabBar 某一项的右上角添加文本
    * @param options
    */
  def setTabBarBadge(options: TabBarBadgeOptions): scala.Unit = js.native
  /**
    * 动态设置 tabBar 某一项的内容
    * @param options
    */
  def setTabBarItem(options: TabBarItemOptions): scala.Unit = js.native
  /**
    * 动态设置tabBar的整体样式
    */
  def setTabBarStyle(options: TabBarItemOptions): scala.Unit = js.native
  /**
    * 显示操作菜单
    */
  def showActionSheet(options: ActionSheetOptions): scala.Unit = js.native
  /**
    * 显示 loading 提示框。需主动调用 wx.hideLoading 才能关闭提示框
    * @param options
    */
  def showLoading(options: LoadingOptions): scala.Unit = js.native
  /**
    * 显示模态对话框
    * @param options
    */
  def showModal(options: ModalOptions): scala.Unit = js.native
  /**
    * 在当前页面显示导航条加载动画。
    */
  def showNavigationBarLoading(): scala.Unit = js.native
  /**
    * 在当前页面显示导航条加载动画
    */
  def showNavigationBarLoading(options: CommonCallbackOptions): scala.Unit = js.native
  /**
    * 显示tabBar
    */
  def showTabBar(options: TabBarAnimationOptions): scala.Unit = js.native
  /**
    * 显示 tabBar 某一项的右上角的红点
    * @param options
    */
  def showTabBarRedDot(options: TabBarRedDotOptions): scala.Unit = js.native
  /**
    * 显示消息提示框
    * @param options
    */
  def showToast(options: ToastOptions): scala.Unit = js.native
  /**
    * 开始下拉刷新。调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
    */
  def startPullDownRefresh(): scala.Unit = js.native
  def startPullDownRefresh(options: CommonCallbackOptions): scala.Unit = js.native
  /**
    * 开始录音。当主动调用wx.stopRecord，
    * 或者录音超过1分钟时自动结束录音，返回录音文件的临时文件路径。
    * 注：文件的临时路径，在小程序本次启动期间可以正常使用，
    * 如需持久保存，需在主动调用wx.saveFile，在小程序下次启动时才能访问得到。
    */
  def startRecord(options: StartRecordOptions): scala.Unit = js.native
  /**
    * 停止播放音乐。
    */
  def stopBackgroundAudio(): scala.Unit = js.native
  //  下拉刷新
  /**
    * 停止当前页面下拉刷新。
    */
  def stopPullDownRefresh(): scala.Unit = js.native
  def stopPullDownRefresh(options: CommonCallbackOptions): scala.Unit = js.native
  /**
    * ​ 主动调用停止录音。
    */
  def stopRecord(): scala.Unit = js.native
  /**
    * 结束播放语音。
    */
  def stopVoice(): scala.Unit = js.native
  /**
    * 跳转到 tabBar 页面，并关闭其他所有非 tabBar 页面
    * @param options
    */
  def switchTab(options: routerOptions): scala.Unit = js.native
  /**
    * 将本地资源上传到开发者服务器。
    * 如页面通过 wx.chooseImage 等接口获取到一个本地资源的临时文件路径后，
    * 可通过此接口将本地资源上传到指定服务器。
    * 客户端发起一个 HTTPS POST 请求，
    * 其中 Content-Type 为 multipart/form-data 。
    */
  def uploadFile(options: UploadFileOptions): UploadTask = js.native
  type AccelerometerChangeCallback = js.Function1[/* res */ AccelerometerData, scala.Unit]
  // 界面
  // 交互
  // tapIndex为用户点击的按钮序号，从上到下的顺序，从0开始
  type ActionSheetSuccessCallback = js.Function1[/* res */ weappDashApiLib.Anon_TapIndex, scala.Unit]
  type CompassChangeCallback = js.Function1[/* res */ CompassData, scala.Unit]
  type DataResponseCallback = js.Function1[/* res */ DataResponse, scala.Unit]
  type ErrorCallback = js.Function1[/* error */ js.Any, scala.Unit]
  type EventCallback = js.Function1[/* event */ js.Any, scala.Unit]
  type GetBackgroundAudioPlayerStateSuccessCallback = js.Function1[/* state */ BackgroundAudioPlayerState, scala.Unit]
  // import startPullDownRefresh = swan.startPullDownRefresh;
  type NoneParamCallback = js.Function0[scala.Unit]
  type OneParamCallback = js.Function1[/* data */ js.Any, scala.Unit]
  type PaymentSignType = weappDashApiLib.weappDashApiLibStrings.MD5
  type ResponseCallback = js.Function1[/* res */ js.Any, scala.Unit]
  type StorageInfoCallback = js.Function1[/* res */ StorageInfoOptions, scala.Unit]
  type TempFileResponseCallback = js.Function1[/* res */ TempFileResponse, scala.Unit]
  type onLaunchCallback = js.Function1[/* options */ onLaunchOptions, scala.Unit]
  type onShowOptions = onLaunchOptions
}

