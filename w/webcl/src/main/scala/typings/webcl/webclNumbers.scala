package typings.webcl

import typings.webcl.WEBCL.AddressingMode
import typings.webcl.WEBCL.Bool
import typings.webcl.WEBCL.BuildStatus
import typings.webcl.WEBCL.ChannelOrder
import typings.webcl.WEBCL.ChannelType
import typings.webcl.WEBCL.CommandExecutionStatus
import typings.webcl.WEBCL.CommandQueueProperties
import typings.webcl.WEBCL.CommandType
import typings.webcl.WEBCL.ContextProperties
import typings.webcl.WEBCL.DeviceFPConfigBits
import typings.webcl.WEBCL.DeviceInfo
import typings.webcl.WEBCL.DeviceLocalMemType
import typings.webcl.WEBCL.DeviceMemCacheType
import typings.webcl.WEBCL.DeviceTypeBits
import typings.webcl.WEBCL.ErrorCodes
import typings.webcl.WEBCL.EventInfo
import typings.webcl.WEBCL.FilterMode
import typings.webcl.WEBCL.ImageInfo
import typings.webcl.WEBCL.KernelInfo
import typings.webcl.WEBCL.KernelWorkGroupInfo
import typings.webcl.WEBCL.MemFlagsBits
import typings.webcl.WEBCL.MemInfo
import typings.webcl.WEBCL.MemObjectType
import typings.webcl.WEBCL.PlatformInfo
import typings.webcl.WEBCL.ProfilingInfo
import typings.webcl.WEBCL.ProgramBuildInfo
import typings.webcl.WEBCL.ProgramInfo
import typings.webcl.WEBCL.SamplerInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object webclNumbers {
  @js.native
  sealed trait `-1`
    extends BuildStatus
       with ErrorCodes
  
  @js.native
  sealed trait `-10` extends ErrorCodes
  
  @js.native
  sealed trait `-11` extends ErrorCodes
  
  @js.native
  sealed trait `-12` extends ErrorCodes
  
  @js.native
  sealed trait `-13` extends ErrorCodes
  
  @js.native
  sealed trait `-14` extends ErrorCodes
  
  @js.native
  sealed trait `-2`
    extends BuildStatus
       with ErrorCodes
  
  @js.native
  sealed trait `-3`
    extends BuildStatus
       with ErrorCodes
  
  @js.native
  sealed trait `-30` extends ErrorCodes
  
  @js.native
  sealed trait `-31` extends ErrorCodes
  
  @js.native
  sealed trait `-32` extends ErrorCodes
  
  @js.native
  sealed trait `-33` extends ErrorCodes
  
  @js.native
  sealed trait `-34` extends ErrorCodes
  
  @js.native
  sealed trait `-35` extends ErrorCodes
  
  @js.native
  sealed trait `-36` extends ErrorCodes
  
  @js.native
  sealed trait `-37` extends ErrorCodes
  
  @js.native
  sealed trait `-38` extends ErrorCodes
  
  @js.native
  sealed trait `-39` extends ErrorCodes
  
  @js.native
  sealed trait `-4` extends ErrorCodes
  
  @js.native
  sealed trait `-40` extends ErrorCodes
  
  @js.native
  sealed trait `-41` extends ErrorCodes
  
  @js.native
  sealed trait `-42` extends ErrorCodes
  
  @js.native
  sealed trait `-43` extends ErrorCodes
  
  @js.native
  sealed trait `-44` extends ErrorCodes
  
  @js.native
  sealed trait `-45` extends ErrorCodes
  
  @js.native
  sealed trait `-46` extends ErrorCodes
  
  @js.native
  sealed trait `-47` extends ErrorCodes
  
  @js.native
  sealed trait `-48` extends ErrorCodes
  
  @js.native
  sealed trait `-49` extends ErrorCodes
  
  @js.native
  sealed trait `-5` extends ErrorCodes
  
  @js.native
  sealed trait `-50` extends ErrorCodes
  
  @js.native
  sealed trait `-51` extends ErrorCodes
  
  @js.native
  sealed trait `-52` extends ErrorCodes
  
  @js.native
  sealed trait `-53` extends ErrorCodes
  
  @js.native
  sealed trait `-54` extends ErrorCodes
  
  @js.native
  sealed trait `-55` extends ErrorCodes
  
  @js.native
  sealed trait `-56` extends ErrorCodes
  
  @js.native
  sealed trait `-57` extends ErrorCodes
  
  @js.native
  sealed trait `-58` extends ErrorCodes
  
  @js.native
  sealed trait `-59` extends ErrorCodes
  
  @js.native
  sealed trait `-6` extends ErrorCodes
  
  @js.native
  sealed trait `-61` extends ErrorCodes
  
  @js.native
  sealed trait `-63` extends ErrorCodes
  
  @js.native
  sealed trait `-64` extends ErrorCodes
  
  @js.native
  sealed trait `-7` extends ErrorCodes
  
  @js.native
  sealed trait `-8` extends ErrorCodes
  
  @js.native
  sealed trait `-9` extends ErrorCodes
  
  @js.native
  sealed trait `0`
    extends Bool
       with BuildStatus
       with ErrorCodes
  
  @js.native
  sealed trait `0x0`
    extends CommandExecutionStatus
       with DeviceMemCacheType
  
  @js.native
  sealed trait `0x0900` extends PlatformInfo
  
  @js.native
  sealed trait `0x0901` extends PlatformInfo
  
  @js.native
  sealed trait `0x0902` extends PlatformInfo
  
  @js.native
  sealed trait `0x0903` extends PlatformInfo
  
  @js.native
  sealed trait `0x0904` extends PlatformInfo
  
  @js.native
  sealed trait `0x1`
    extends CommandExecutionStatus
       with CommandQueueProperties
       with DeviceFPConfigBits
       with DeviceLocalMemType
       with DeviceMemCacheType
       with DeviceTypeBits
       with MemFlagsBits
  
  @js.native
  sealed trait `0x10` extends DeviceFPConfigBits
  
  @js.native
  sealed trait `0x1000` extends DeviceInfo
  
  @js.native
  sealed trait `0x1001` extends DeviceInfo
  
  @js.native
  sealed trait `0x1002` extends DeviceInfo
  
  @js.native
  sealed trait `0x1003` extends DeviceInfo
  
  @js.native
  sealed trait `0x1004` extends DeviceInfo
  
  @js.native
  sealed trait `0x1005` extends DeviceInfo
  
  @js.native
  sealed trait `0x1006` extends DeviceInfo
  
  @js.native
  sealed trait `0x1007` extends DeviceInfo
  
  @js.native
  sealed trait `0x1008` extends DeviceInfo
  
  @js.native
  sealed trait `0x1009` extends DeviceInfo
  
  @js.native
  sealed trait `0x100A` extends DeviceInfo
  
  @js.native
  sealed trait `0x100C` extends DeviceInfo
  
  @js.native
  sealed trait `0x100D` extends DeviceInfo
  
  @js.native
  sealed trait `0x100E` extends DeviceInfo
  
  @js.native
  sealed trait `0x100F` extends DeviceInfo
  
  @js.native
  sealed trait `0x1010` extends DeviceInfo
  
  @js.native
  sealed trait `0x1011` extends DeviceInfo
  
  @js.native
  sealed trait `0x1012` extends DeviceInfo
  
  @js.native
  sealed trait `0x1013` extends DeviceInfo
  
  @js.native
  sealed trait `0x1014` extends DeviceInfo
  
  @js.native
  sealed trait `0x1015` extends DeviceInfo
  
  @js.native
  sealed trait `0x1016` extends DeviceInfo
  
  @js.native
  sealed trait `0x1017` extends DeviceInfo
  
  @js.native
  sealed trait `0x1018` extends DeviceInfo
  
  @js.native
  sealed trait `0x1019` extends DeviceInfo
  
  @js.native
  sealed trait `0x101B` extends DeviceInfo
  
  @js.native
  sealed trait `0x101C` extends DeviceInfo
  
  @js.native
  sealed trait `0x101D` extends DeviceInfo
  
  @js.native
  sealed trait `0x101E` extends DeviceInfo
  
  @js.native
  sealed trait `0x101F` extends DeviceInfo
  
  @js.native
  sealed trait `0x1020` extends DeviceInfo
  
  @js.native
  sealed trait `0x1021` extends DeviceInfo
  
  @js.native
  sealed trait `0x1022` extends DeviceInfo
  
  @js.native
  sealed trait `0x1023` extends DeviceInfo
  
  @js.native
  sealed trait `0x1024` extends DeviceInfo
  
  @js.native
  sealed trait `0x1025` extends DeviceInfo
  
  @js.native
  sealed trait `0x1026` extends DeviceInfo
  
  @js.native
  sealed trait `0x1027` extends DeviceInfo
  
  @js.native
  sealed trait `0x1028` extends DeviceInfo
  
  @js.native
  sealed trait `0x1029` extends DeviceInfo
  
  @js.native
  sealed trait `0x102A` extends DeviceInfo
  
  @js.native
  sealed trait `0x102B` extends DeviceInfo
  
  @js.native
  sealed trait `0x102C` extends DeviceInfo
  
  @js.native
  sealed trait `0x102D` extends DeviceInfo
  
  @js.native
  sealed trait `0x102E` extends DeviceInfo
  
  @js.native
  sealed trait `0x102F` extends DeviceInfo
  
  @js.native
  sealed trait `0x1030` extends DeviceInfo
  
  @js.native
  sealed trait `0x1031` extends DeviceInfo
  
  @js.native
  sealed trait `0x1035` extends DeviceInfo
  
  @js.native
  sealed trait `0x1036` extends DeviceInfo
  
  @js.native
  sealed trait `0x1037` extends DeviceInfo
  
  @js.native
  sealed trait `0x1038` extends DeviceInfo
  
  @js.native
  sealed trait `0x1039` extends DeviceInfo
  
  @js.native
  sealed trait `0x103A` extends DeviceInfo
  
  @js.native
  sealed trait `0x103D` extends DeviceInfo
  
  @js.native
  sealed trait `0x1081` extends js.Object
  
  @js.native
  sealed trait `0x1090` extends ContextProperties
  
  @js.native
  sealed trait `0x1091` extends ContextProperties
  
  @js.native
  sealed trait `0x1093` extends ContextProperties
  
  @js.native
  sealed trait `0x10B0` extends ChannelOrder
  
  @js.native
  sealed trait `0x10B1` extends ChannelOrder
  
  @js.native
  sealed trait `0x10B2` extends ChannelOrder
  
  @js.native
  sealed trait `0x10B3` extends ChannelOrder
  
  @js.native
  sealed trait `0x10B4` extends ChannelOrder
  
  @js.native
  sealed trait `0x10B5` extends ChannelOrder
  
  @js.native
  sealed trait `0x10B6` extends ChannelOrder
  
  @js.native
  sealed trait `0x10B7` extends ChannelOrder
  
  @js.native
  sealed trait `0x10B8` extends ChannelOrder
  
  @js.native
  sealed trait `0x10B9` extends ChannelOrder
  
  @js.native
  sealed trait `0x10BA` extends ChannelOrder
  
  @js.native
  sealed trait `0x10BB` extends ChannelOrder
  
  @js.native
  sealed trait `0x10BC` extends ChannelOrder
  
  @js.native
  sealed trait `0x10D0` extends ChannelType
  
  @js.native
  sealed trait `0x10D1` extends ChannelType
  
  @js.native
  sealed trait `0x10D2` extends ChannelType
  
  @js.native
  sealed trait `0x10D3` extends ChannelType
  
  @js.native
  sealed trait `0x10D4` extends ChannelType
  
  @js.native
  sealed trait `0x10D5` extends ChannelType
  
  @js.native
  sealed trait `0x10D6` extends ChannelType
  
  @js.native
  sealed trait `0x10D7` extends ChannelType
  
  @js.native
  sealed trait `0x10D8` extends ChannelType
  
  @js.native
  sealed trait `0x10D9` extends ChannelType
  
  @js.native
  sealed trait `0x10DA` extends ChannelType
  
  @js.native
  sealed trait `0x10DB` extends ChannelType
  
  @js.native
  sealed trait `0x10DC` extends ChannelType
  
  @js.native
  sealed trait `0x10DD` extends ChannelType
  
  @js.native
  sealed trait `0x10DE` extends ChannelType
  
  @js.native
  sealed trait `0x10F0` extends MemObjectType
  
  @js.native
  sealed trait `0x10F1` extends MemObjectType
  
  @js.native
  sealed trait `0x10F2` extends MemObjectType
  
  @js.native
  sealed trait `0x1100` extends MemInfo
  
  @js.native
  sealed trait `0x1101` extends MemInfo
  
  @js.native
  sealed trait `0x1102` extends MemInfo
  
  @js.native
  sealed trait `0x1106` extends MemInfo
  
  @js.native
  sealed trait `0x1107` extends MemInfo
  
  @js.native
  sealed trait `0x1108` extends MemInfo
  
  @js.native
  sealed trait `0x1110` extends ImageInfo
  
  @js.native
  sealed trait `0x1111` extends ImageInfo
  
  @js.native
  sealed trait `0x1112` extends ImageInfo
  
  @js.native
  sealed trait `0x1114` extends ImageInfo
  
  @js.native
  sealed trait `0x1115` extends ImageInfo
  
  @js.native
  sealed trait `0x1131` extends AddressingMode
  
  @js.native
  sealed trait `0x1132` extends AddressingMode
  
  @js.native
  sealed trait `0x1133` extends AddressingMode
  
  @js.native
  sealed trait `0x1134` extends AddressingMode
  
  @js.native
  sealed trait `0x1140` extends FilterMode
  
  @js.native
  sealed trait `0x1141` extends FilterMode
  
  @js.native
  sealed trait `0x1151` extends SamplerInfo
  
  @js.native
  sealed trait `0x1152` extends SamplerInfo
  
  @js.native
  sealed trait `0x1153` extends SamplerInfo
  
  @js.native
  sealed trait `0x1154` extends SamplerInfo
  
  @js.native
  sealed trait `0x1161` extends ProgramInfo
  
  @js.native
  sealed trait `0x1162` extends ProgramInfo
  
  @js.native
  sealed trait `0x1163` extends ProgramInfo
  
  @js.native
  sealed trait `0x1164` extends ProgramInfo
  
  @js.native
  sealed trait `0x1181` extends ProgramBuildInfo
  
  @js.native
  sealed trait `0x1182` extends ProgramBuildInfo
  
  @js.native
  sealed trait `0x1183` extends ProgramBuildInfo
  
  @js.native
  sealed trait `0x1190` extends KernelInfo
  
  @js.native
  sealed trait `0x1191` extends KernelInfo
  
  @js.native
  sealed trait `0x1193` extends KernelInfo
  
  @js.native
  sealed trait `0x1194` extends KernelInfo
  
  @js.native
  sealed trait `0x11B0` extends KernelWorkGroupInfo
  
  @js.native
  sealed trait `0x11B1` extends KernelWorkGroupInfo
  
  @js.native
  sealed trait `0x11B2` extends KernelWorkGroupInfo
  
  @js.native
  sealed trait `0x11B3` extends KernelWorkGroupInfo
  
  @js.native
  sealed trait `0x11B4` extends KernelWorkGroupInfo
  
  @js.native
  sealed trait `0x11D0` extends EventInfo
  
  @js.native
  sealed trait `0x11D1` extends EventInfo
  
  @js.native
  sealed trait `0x11D3` extends EventInfo
  
  @js.native
  sealed trait `0x11D4` extends EventInfo
  
  @js.native
  sealed trait `0x11F0` extends CommandType
  
  @js.native
  sealed trait `0x11F1` extends CommandType
  
  @js.native
  sealed trait `0x11F3` extends CommandType
  
  @js.native
  sealed trait `0x11F4` extends CommandType
  
  @js.native
  sealed trait `0x11F5` extends CommandType
  
  @js.native
  sealed trait `0x11F6` extends CommandType
  
  @js.native
  sealed trait `0x11F7` extends CommandType
  
  @js.native
  sealed trait `0x11F8` extends CommandType
  
  @js.native
  sealed trait `0x11F9` extends CommandType
  
  @js.native
  sealed trait `0x11FA` extends CommandType
  
  @js.native
  sealed trait `0x11FE` extends CommandType
  
  @js.native
  sealed trait `0x1201` extends CommandType
  
  @js.native
  sealed trait `0x1202` extends CommandType
  
  @js.native
  sealed trait `0x1203` extends CommandType
  
  @js.native
  sealed trait `0x1204` extends CommandType
  
  @js.native
  sealed trait `0x1280` extends ProfilingInfo
  
  @js.native
  sealed trait `0x1281` extends ProfilingInfo
  
  @js.native
  sealed trait `0x1282` extends ProfilingInfo
  
  @js.native
  sealed trait `0x1283` extends ProfilingInfo
  
  @js.native
  sealed trait `0x2`
    extends CommandExecutionStatus
       with CommandQueueProperties
       with DeviceFPConfigBits
       with DeviceLocalMemType
       with DeviceMemCacheType
       with DeviceTypeBits
       with MemFlagsBits
  
  @js.native
  sealed trait `0x20` extends DeviceFPConfigBits
  
  @js.native
  sealed trait `0x3` extends CommandExecutionStatus
  
  @js.native
  sealed trait `0x4`
    extends DeviceFPConfigBits
       with DeviceTypeBits
       with MemFlagsBits
  
  @js.native
  sealed trait `0x40` extends DeviceFPConfigBits
  
  @js.native
  sealed trait `0x8`
    extends DeviceFPConfigBits
       with DeviceTypeBits
  
  @js.native
  sealed trait `1` extends Bool
  
  @js.native
  sealed trait _0xFFFFFFFF extends DeviceTypeBits
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `-10`: `-10` = -10.asInstanceOf[`-10`]
  @scala.inline
  def `-11`: `-11` = -11.asInstanceOf[`-11`]
  @scala.inline
  def `-12`: `-12` = -12.asInstanceOf[`-12`]
  @scala.inline
  def `-13`: `-13` = -13.asInstanceOf[`-13`]
  @scala.inline
  def `-14`: `-14` = -14.asInstanceOf[`-14`]
  @scala.inline
  def `-2`: `-2` = -2.asInstanceOf[`-2`]
  @scala.inline
  def `-3`: `-3` = -3.asInstanceOf[`-3`]
  @scala.inline
  def `-30`: `-30` = -30.asInstanceOf[`-30`]
  @scala.inline
  def `-31`: `-31` = -31.asInstanceOf[`-31`]
  @scala.inline
  def `-32`: `-32` = -32.asInstanceOf[`-32`]
  @scala.inline
  def `-33`: `-33` = -33.asInstanceOf[`-33`]
  @scala.inline
  def `-34`: `-34` = -34.asInstanceOf[`-34`]
  @scala.inline
  def `-35`: `-35` = -35.asInstanceOf[`-35`]
  @scala.inline
  def `-36`: `-36` = -36.asInstanceOf[`-36`]
  @scala.inline
  def `-37`: `-37` = -37.asInstanceOf[`-37`]
  @scala.inline
  def `-38`: `-38` = -38.asInstanceOf[`-38`]
  @scala.inline
  def `-39`: `-39` = -39.asInstanceOf[`-39`]
  @scala.inline
  def `-4`: `-4` = -4.asInstanceOf[`-4`]
  @scala.inline
  def `-40`: `-40` = -40.asInstanceOf[`-40`]
  @scala.inline
  def `-41`: `-41` = -41.asInstanceOf[`-41`]
  @scala.inline
  def `-42`: `-42` = -42.asInstanceOf[`-42`]
  @scala.inline
  def `-43`: `-43` = -43.asInstanceOf[`-43`]
  @scala.inline
  def `-44`: `-44` = -44.asInstanceOf[`-44`]
  @scala.inline
  def `-45`: `-45` = -45.asInstanceOf[`-45`]
  @scala.inline
  def `-46`: `-46` = -46.asInstanceOf[`-46`]
  @scala.inline
  def `-47`: `-47` = -47.asInstanceOf[`-47`]
  @scala.inline
  def `-48`: `-48` = -48.asInstanceOf[`-48`]
  @scala.inline
  def `-49`: `-49` = -49.asInstanceOf[`-49`]
  @scala.inline
  def `-5`: `-5` = -5.asInstanceOf[`-5`]
  @scala.inline
  def `-50`: `-50` = -50.asInstanceOf[`-50`]
  @scala.inline
  def `-51`: `-51` = -51.asInstanceOf[`-51`]
  @scala.inline
  def `-52`: `-52` = -52.asInstanceOf[`-52`]
  @scala.inline
  def `-53`: `-53` = -53.asInstanceOf[`-53`]
  @scala.inline
  def `-54`: `-54` = -54.asInstanceOf[`-54`]
  @scala.inline
  def `-55`: `-55` = -55.asInstanceOf[`-55`]
  @scala.inline
  def `-56`: `-56` = -56.asInstanceOf[`-56`]
  @scala.inline
  def `-57`: `-57` = -57.asInstanceOf[`-57`]
  @scala.inline
  def `-58`: `-58` = -58.asInstanceOf[`-58`]
  @scala.inline
  def `-59`: `-59` = -59.asInstanceOf[`-59`]
  @scala.inline
  def `-6`: `-6` = -6.asInstanceOf[`-6`]
  @scala.inline
  def `-61`: `-61` = -61.asInstanceOf[`-61`]
  @scala.inline
  def `-63`: `-63` = -63.asInstanceOf[`-63`]
  @scala.inline
  def `-64`: `-64` = -64.asInstanceOf[`-64`]
  @scala.inline
  def `-7`: `-7` = -7.asInstanceOf[`-7`]
  @scala.inline
  def `-8`: `-8` = -8.asInstanceOf[`-8`]
  @scala.inline
  def `-9`: `-9` = -9.asInstanceOf[`-9`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `0x0`: `0x0` = 0x0.asInstanceOf[`0x0`]
  @scala.inline
  def `0x0900`: `0x0900` = 0x0900.asInstanceOf[`0x0900`]
  @scala.inline
  def `0x0901`: `0x0901` = 0x0901.asInstanceOf[`0x0901`]
  @scala.inline
  def `0x0902`: `0x0902` = 0x0902.asInstanceOf[`0x0902`]
  @scala.inline
  def `0x0903`: `0x0903` = 0x0903.asInstanceOf[`0x0903`]
  @scala.inline
  def `0x0904`: `0x0904` = 0x0904.asInstanceOf[`0x0904`]
  @scala.inline
  def `0x1`: `0x1` = 0x1.asInstanceOf[`0x1`]
  @scala.inline
  def `0x10`: `0x10` = 0x10.asInstanceOf[`0x10`]
  @scala.inline
  def `0x1000`: `0x1000` = 0x1000.asInstanceOf[`0x1000`]
  @scala.inline
  def `0x1001`: `0x1001` = 0x1001.asInstanceOf[`0x1001`]
  @scala.inline
  def `0x1002`: `0x1002` = 0x1002.asInstanceOf[`0x1002`]
  @scala.inline
  def `0x1003`: `0x1003` = 0x1003.asInstanceOf[`0x1003`]
  @scala.inline
  def `0x1004`: `0x1004` = 0x1004.asInstanceOf[`0x1004`]
  @scala.inline
  def `0x1005`: `0x1005` = 0x1005.asInstanceOf[`0x1005`]
  @scala.inline
  def `0x1006`: `0x1006` = 0x1006.asInstanceOf[`0x1006`]
  @scala.inline
  def `0x1007`: `0x1007` = 0x1007.asInstanceOf[`0x1007`]
  @scala.inline
  def `0x1008`: `0x1008` = 0x1008.asInstanceOf[`0x1008`]
  @scala.inline
  def `0x1009`: `0x1009` = 0x1009.asInstanceOf[`0x1009`]
  @scala.inline
  def `0x100A`: `0x100A` = 0x100A.asInstanceOf[`0x100A`]
  @scala.inline
  def `0x100C`: `0x100C` = 0x100C.asInstanceOf[`0x100C`]
  @scala.inline
  def `0x100D`: `0x100D` = 0x100D.asInstanceOf[`0x100D`]
  @scala.inline
  def `0x100E`: `0x100E` = 0x100E.asInstanceOf[`0x100E`]
  @scala.inline
  def `0x100F`: `0x100F` = 0x100F.asInstanceOf[`0x100F`]
  @scala.inline
  def `0x1010`: `0x1010` = 0x1010.asInstanceOf[`0x1010`]
  @scala.inline
  def `0x1011`: `0x1011` = 0x1011.asInstanceOf[`0x1011`]
  @scala.inline
  def `0x1012`: `0x1012` = 0x1012.asInstanceOf[`0x1012`]
  @scala.inline
  def `0x1013`: `0x1013` = 0x1013.asInstanceOf[`0x1013`]
  @scala.inline
  def `0x1014`: `0x1014` = 0x1014.asInstanceOf[`0x1014`]
  @scala.inline
  def `0x1015`: `0x1015` = 0x1015.asInstanceOf[`0x1015`]
  @scala.inline
  def `0x1016`: `0x1016` = 0x1016.asInstanceOf[`0x1016`]
  @scala.inline
  def `0x1017`: `0x1017` = 0x1017.asInstanceOf[`0x1017`]
  @scala.inline
  def `0x1018`: `0x1018` = 0x1018.asInstanceOf[`0x1018`]
  @scala.inline
  def `0x1019`: `0x1019` = 0x1019.asInstanceOf[`0x1019`]
  @scala.inline
  def `0x101B`: `0x101B` = 0x101B.asInstanceOf[`0x101B`]
  @scala.inline
  def `0x101C`: `0x101C` = 0x101C.asInstanceOf[`0x101C`]
  @scala.inline
  def `0x101D`: `0x101D` = 0x101D.asInstanceOf[`0x101D`]
  @scala.inline
  def `0x101E`: `0x101E` = 0x101E.asInstanceOf[`0x101E`]
  @scala.inline
  def `0x101F`: `0x101F` = 0x101F.asInstanceOf[`0x101F`]
  @scala.inline
  def `0x1020`: `0x1020` = 0x1020.asInstanceOf[`0x1020`]
  @scala.inline
  def `0x1021`: `0x1021` = 0x1021.asInstanceOf[`0x1021`]
  @scala.inline
  def `0x1022`: `0x1022` = 0x1022.asInstanceOf[`0x1022`]
  @scala.inline
  def `0x1023`: `0x1023` = 0x1023.asInstanceOf[`0x1023`]
  @scala.inline
  def `0x1024`: `0x1024` = 0x1024.asInstanceOf[`0x1024`]
  @scala.inline
  def `0x1025`: `0x1025` = 0x1025.asInstanceOf[`0x1025`]
  @scala.inline
  def `0x1026`: `0x1026` = 0x1026.asInstanceOf[`0x1026`]
  @scala.inline
  def `0x1027`: `0x1027` = 0x1027.asInstanceOf[`0x1027`]
  @scala.inline
  def `0x1028`: `0x1028` = 0x1028.asInstanceOf[`0x1028`]
  @scala.inline
  def `0x1029`: `0x1029` = 0x1029.asInstanceOf[`0x1029`]
  @scala.inline
  def `0x102A`: `0x102A` = 0x102A.asInstanceOf[`0x102A`]
  @scala.inline
  def `0x102B`: `0x102B` = 0x102B.asInstanceOf[`0x102B`]
  @scala.inline
  def `0x102C`: `0x102C` = 0x102C.asInstanceOf[`0x102C`]
  @scala.inline
  def `0x102D`: `0x102D` = 0x102D.asInstanceOf[`0x102D`]
  @scala.inline
  def `0x102E`: `0x102E` = 0x102E.asInstanceOf[`0x102E`]
  @scala.inline
  def `0x102F`: `0x102F` = 0x102F.asInstanceOf[`0x102F`]
  @scala.inline
  def `0x1030`: `0x1030` = 0x1030.asInstanceOf[`0x1030`]
  @scala.inline
  def `0x1031`: `0x1031` = 0x1031.asInstanceOf[`0x1031`]
  @scala.inline
  def `0x1035`: `0x1035` = 0x1035.asInstanceOf[`0x1035`]
  @scala.inline
  def `0x1036`: `0x1036` = 0x1036.asInstanceOf[`0x1036`]
  @scala.inline
  def `0x1037`: `0x1037` = 0x1037.asInstanceOf[`0x1037`]
  @scala.inline
  def `0x1038`: `0x1038` = 0x1038.asInstanceOf[`0x1038`]
  @scala.inline
  def `0x1039`: `0x1039` = 0x1039.asInstanceOf[`0x1039`]
  @scala.inline
  def `0x103A`: `0x103A` = 0x103A.asInstanceOf[`0x103A`]
  @scala.inline
  def `0x103D`: `0x103D` = 0x103D.asInstanceOf[`0x103D`]
  @scala.inline
  def `0x1081`: `0x1081` = 0x1081.asInstanceOf[`0x1081`]
  @scala.inline
  def `0x1090`: `0x1090` = 0x1090.asInstanceOf[`0x1090`]
  @scala.inline
  def `0x1091`: `0x1091` = 0x1091.asInstanceOf[`0x1091`]
  @scala.inline
  def `0x1093`: `0x1093` = 0x1093.asInstanceOf[`0x1093`]
  @scala.inline
  def `0x10B0`: `0x10B0` = 0x10B0.asInstanceOf[`0x10B0`]
  @scala.inline
  def `0x10B1`: `0x10B1` = 0x10B1.asInstanceOf[`0x10B1`]
  @scala.inline
  def `0x10B2`: `0x10B2` = 0x10B2.asInstanceOf[`0x10B2`]
  @scala.inline
  def `0x10B3`: `0x10B3` = 0x10B3.asInstanceOf[`0x10B3`]
  @scala.inline
  def `0x10B4`: `0x10B4` = 0x10B4.asInstanceOf[`0x10B4`]
  @scala.inline
  def `0x10B5`: `0x10B5` = 0x10B5.asInstanceOf[`0x10B5`]
  @scala.inline
  def `0x10B6`: `0x10B6` = 0x10B6.asInstanceOf[`0x10B6`]
  @scala.inline
  def `0x10B7`: `0x10B7` = 0x10B7.asInstanceOf[`0x10B7`]
  @scala.inline
  def `0x10B8`: `0x10B8` = 0x10B8.asInstanceOf[`0x10B8`]
  @scala.inline
  def `0x10B9`: `0x10B9` = 0x10B9.asInstanceOf[`0x10B9`]
  @scala.inline
  def `0x10BA`: `0x10BA` = 0x10BA.asInstanceOf[`0x10BA`]
  @scala.inline
  def `0x10BB`: `0x10BB` = 0x10BB.asInstanceOf[`0x10BB`]
  @scala.inline
  def `0x10BC`: `0x10BC` = 0x10BC.asInstanceOf[`0x10BC`]
  @scala.inline
  def `0x10D0`: `0x10D0` = 0x10D0.asInstanceOf[`0x10D0`]
  @scala.inline
  def `0x10D1`: `0x10D1` = 0x10D1.asInstanceOf[`0x10D1`]
  @scala.inline
  def `0x10D2`: `0x10D2` = 0x10D2.asInstanceOf[`0x10D2`]
  @scala.inline
  def `0x10D3`: `0x10D3` = 0x10D3.asInstanceOf[`0x10D3`]
  @scala.inline
  def `0x10D4`: `0x10D4` = 0x10D4.asInstanceOf[`0x10D4`]
  @scala.inline
  def `0x10D5`: `0x10D5` = 0x10D5.asInstanceOf[`0x10D5`]
  @scala.inline
  def `0x10D6`: `0x10D6` = 0x10D6.asInstanceOf[`0x10D6`]
  @scala.inline
  def `0x10D7`: `0x10D7` = 0x10D7.asInstanceOf[`0x10D7`]
  @scala.inline
  def `0x10D8`: `0x10D8` = 0x10D8.asInstanceOf[`0x10D8`]
  @scala.inline
  def `0x10D9`: `0x10D9` = 0x10D9.asInstanceOf[`0x10D9`]
  @scala.inline
  def `0x10DA`: `0x10DA` = 0x10DA.asInstanceOf[`0x10DA`]
  @scala.inline
  def `0x10DB`: `0x10DB` = 0x10DB.asInstanceOf[`0x10DB`]
  @scala.inline
  def `0x10DC`: `0x10DC` = 0x10DC.asInstanceOf[`0x10DC`]
  @scala.inline
  def `0x10DD`: `0x10DD` = 0x10DD.asInstanceOf[`0x10DD`]
  @scala.inline
  def `0x10DE`: `0x10DE` = 0x10DE.asInstanceOf[`0x10DE`]
  @scala.inline
  def `0x10F0`: `0x10F0` = 0x10F0.asInstanceOf[`0x10F0`]
  @scala.inline
  def `0x10F1`: `0x10F1` = 0x10F1.asInstanceOf[`0x10F1`]
  @scala.inline
  def `0x10F2`: `0x10F2` = 0x10F2.asInstanceOf[`0x10F2`]
  @scala.inline
  def `0x1100`: `0x1100` = 0x1100.asInstanceOf[`0x1100`]
  @scala.inline
  def `0x1101`: `0x1101` = 0x1101.asInstanceOf[`0x1101`]
  @scala.inline
  def `0x1102`: `0x1102` = 0x1102.asInstanceOf[`0x1102`]
  @scala.inline
  def `0x1106`: `0x1106` = 0x1106.asInstanceOf[`0x1106`]
  @scala.inline
  def `0x1107`: `0x1107` = 0x1107.asInstanceOf[`0x1107`]
  @scala.inline
  def `0x1108`: `0x1108` = 0x1108.asInstanceOf[`0x1108`]
  @scala.inline
  def `0x1110`: `0x1110` = 0x1110.asInstanceOf[`0x1110`]
  @scala.inline
  def `0x1111`: `0x1111` = 0x1111.asInstanceOf[`0x1111`]
  @scala.inline
  def `0x1112`: `0x1112` = 0x1112.asInstanceOf[`0x1112`]
  @scala.inline
  def `0x1114`: `0x1114` = 0x1114.asInstanceOf[`0x1114`]
  @scala.inline
  def `0x1115`: `0x1115` = 0x1115.asInstanceOf[`0x1115`]
  @scala.inline
  def `0x1131`: `0x1131` = 0x1131.asInstanceOf[`0x1131`]
  @scala.inline
  def `0x1132`: `0x1132` = 0x1132.asInstanceOf[`0x1132`]
  @scala.inline
  def `0x1133`: `0x1133` = 0x1133.asInstanceOf[`0x1133`]
  @scala.inline
  def `0x1134`: `0x1134` = 0x1134.asInstanceOf[`0x1134`]
  @scala.inline
  def `0x1140`: `0x1140` = 0x1140.asInstanceOf[`0x1140`]
  @scala.inline
  def `0x1141`: `0x1141` = 0x1141.asInstanceOf[`0x1141`]
  @scala.inline
  def `0x1151`: `0x1151` = 0x1151.asInstanceOf[`0x1151`]
  @scala.inline
  def `0x1152`: `0x1152` = 0x1152.asInstanceOf[`0x1152`]
  @scala.inline
  def `0x1153`: `0x1153` = 0x1153.asInstanceOf[`0x1153`]
  @scala.inline
  def `0x1154`: `0x1154` = 0x1154.asInstanceOf[`0x1154`]
  @scala.inline
  def `0x1161`: `0x1161` = 0x1161.asInstanceOf[`0x1161`]
  @scala.inline
  def `0x1162`: `0x1162` = 0x1162.asInstanceOf[`0x1162`]
  @scala.inline
  def `0x1163`: `0x1163` = 0x1163.asInstanceOf[`0x1163`]
  @scala.inline
  def `0x1164`: `0x1164` = 0x1164.asInstanceOf[`0x1164`]
  @scala.inline
  def `0x1181`: `0x1181` = 0x1181.asInstanceOf[`0x1181`]
  @scala.inline
  def `0x1182`: `0x1182` = 0x1182.asInstanceOf[`0x1182`]
  @scala.inline
  def `0x1183`: `0x1183` = 0x1183.asInstanceOf[`0x1183`]
  @scala.inline
  def `0x1190`: `0x1190` = 0x1190.asInstanceOf[`0x1190`]
  @scala.inline
  def `0x1191`: `0x1191` = 0x1191.asInstanceOf[`0x1191`]
  @scala.inline
  def `0x1193`: `0x1193` = 0x1193.asInstanceOf[`0x1193`]
  @scala.inline
  def `0x1194`: `0x1194` = 0x1194.asInstanceOf[`0x1194`]
  @scala.inline
  def `0x11B0`: `0x11B0` = 0x11B0.asInstanceOf[`0x11B0`]
  @scala.inline
  def `0x11B1`: `0x11B1` = 0x11B1.asInstanceOf[`0x11B1`]
  @scala.inline
  def `0x11B2`: `0x11B2` = 0x11B2.asInstanceOf[`0x11B2`]
  @scala.inline
  def `0x11B3`: `0x11B3` = 0x11B3.asInstanceOf[`0x11B3`]
  @scala.inline
  def `0x11B4`: `0x11B4` = 0x11B4.asInstanceOf[`0x11B4`]
  @scala.inline
  def `0x11D0`: `0x11D0` = 0x11D0.asInstanceOf[`0x11D0`]
  @scala.inline
  def `0x11D1`: `0x11D1` = 0x11D1.asInstanceOf[`0x11D1`]
  @scala.inline
  def `0x11D3`: `0x11D3` = 0x11D3.asInstanceOf[`0x11D3`]
  @scala.inline
  def `0x11D4`: `0x11D4` = 0x11D4.asInstanceOf[`0x11D4`]
  @scala.inline
  def `0x11F0`: `0x11F0` = 0x11F0.asInstanceOf[`0x11F0`]
  @scala.inline
  def `0x11F1`: `0x11F1` = 0x11F1.asInstanceOf[`0x11F1`]
  @scala.inline
  def `0x11F3`: `0x11F3` = 0x11F3.asInstanceOf[`0x11F3`]
  @scala.inline
  def `0x11F4`: `0x11F4` = 0x11F4.asInstanceOf[`0x11F4`]
  @scala.inline
  def `0x11F5`: `0x11F5` = 0x11F5.asInstanceOf[`0x11F5`]
  @scala.inline
  def `0x11F6`: `0x11F6` = 0x11F6.asInstanceOf[`0x11F6`]
  @scala.inline
  def `0x11F7`: `0x11F7` = 0x11F7.asInstanceOf[`0x11F7`]
  @scala.inline
  def `0x11F8`: `0x11F8` = 0x11F8.asInstanceOf[`0x11F8`]
  @scala.inline
  def `0x11F9`: `0x11F9` = 0x11F9.asInstanceOf[`0x11F9`]
  @scala.inline
  def `0x11FA`: `0x11FA` = 0x11FA.asInstanceOf[`0x11FA`]
  @scala.inline
  def `0x11FE`: `0x11FE` = 0x11FE.asInstanceOf[`0x11FE`]
  @scala.inline
  def `0x1201`: `0x1201` = 0x1201.asInstanceOf[`0x1201`]
  @scala.inline
  def `0x1202`: `0x1202` = 0x1202.asInstanceOf[`0x1202`]
  @scala.inline
  def `0x1203`: `0x1203` = 0x1203.asInstanceOf[`0x1203`]
  @scala.inline
  def `0x1204`: `0x1204` = 0x1204.asInstanceOf[`0x1204`]
  @scala.inline
  def `0x1280`: `0x1280` = 0x1280.asInstanceOf[`0x1280`]
  @scala.inline
  def `0x1281`: `0x1281` = 0x1281.asInstanceOf[`0x1281`]
  @scala.inline
  def `0x1282`: `0x1282` = 0x1282.asInstanceOf[`0x1282`]
  @scala.inline
  def `0x1283`: `0x1283` = 0x1283.asInstanceOf[`0x1283`]
  @scala.inline
  def `0x2`: `0x2` = 0x2.asInstanceOf[`0x2`]
  @scala.inline
  def `0x20`: `0x20` = 0x20.asInstanceOf[`0x20`]
  @scala.inline
  def `0x3`: `0x3` = 0x3.asInstanceOf[`0x3`]
  @scala.inline
  def `0x4`: `0x4` = 0x4.asInstanceOf[`0x4`]
  @scala.inline
  def `0x40`: `0x40` = 0x40.asInstanceOf[`0x40`]
  @scala.inline
  def `0x8`: `0x8` = 0x8.asInstanceOf[`0x8`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def _0xFFFFFFFF: _0xFFFFFFFF = 4294967295.0.asInstanceOf[_0xFFFFFFFF]
}

